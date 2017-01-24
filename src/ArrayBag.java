/**
 * Created by Joshuak on 1/23/2017.
 */

public abstract class ArrayBag<T> implements BagInterface<T> {
     private final T[] bag;
     private static final int DEFAULT_CAPACITY = 25;
     private int numberOfEntries;

     /**
      * Creates an empty bag whose initial capacity is 25
      */
     public ArrayBag() {
          this(DEFAULT_CAPACITY);
     } // end of default Constructor
     public ArrayBag(int capacity) {
          numberOfEntries = 0;
          @SuppressWarnings("unchecked")
                  T[] tempBag = (T[]) new Object[capacity];
          bag = tempBag;
     } // end Constructor

     /**
      * Adds a new entry to the bag
      * @param newEntry the object to added as new entry
      * @return true if addition is successful, false if not
      */
     public boolean add(T newEntry) {
          boolean result = true;
          if (isFull()) {
               result = false;
          } else {
               bag[numberOfEntries] = newEntry;
               numberOfEntries++;
          } // end if
          return result;
     } // end of add

     /**
      * Removes one unspecified entry from this bag, if possible
      * @return either removed entry if successful or null if not successful
      */
     public T remove() {
          T result = null;
          if (numberOfEntries > 0) {
               numberOfEntries--;
               result = bag[numberOfEntries];
               bag[numberOfEntries] = null;
          } // end if
          return result;
     } // end remove

     /**
      * Removes one occurrence of a given entry from this bag
      * @param anEntry the entry to be removed
      * @return true if removal is successful, false if not
      */
     public boolean remove (T anEntry) {
          int index = getIndexOf(anEntry);
          T result = removeEntry(index);
          return anEntry.equals(result);
     } // end remove

     /**
      * Removes and returns the entry at given index within the array bag
      * @param givenIndex
      * @return true if successfully removed, false if not
      */
     private T removeEntry(int givenIndex) {
           T result = null;
           if (!isEmpty() && (givenIndex >= 0)) {
                result = bag[givenIndex]; // entry to remove
                numberOfEntries--;
                bag[givenIndex] = bag[numberOfEntries]; // replace entry with last entry
                bag[numberOfEntries] = null; // remove last entry
           } // end if
           return result;
     } // end removeEntry

     /**
      * Locates a given entry within the array bag
      * @param anEntry
      * @return index of entry if found, or -1 if not
      */
     private int getIndexOf(T anEntry) {
          int where = -1;
          boolean stillLooking = true;
          for (int index = 0; stillLooking && (index < numberOfEntries); index++) {
               if (anEntry.equals(bag[index])) {
                    stillLooking = false;
                    where = index;
               } // end if
          } // end for
          return where;
     } // end getIndexOf

     /**
      * Removes all entries from this bag
      */
     public void clear() {
          while (!isEmpty()) {
               remove();
          } // end while
     } // end clear

     /**
      * Retrieves all entries that are in the bag
      * @return a newly allocated array of all the entries in the bag
      */
     public T[] toArray() {
          T[] result = (T[]) new Object[numberOfEntries];
          for (int index = 0; index < numberOfEntries; index++) {
               result[index] = bag[index];
          } // end for
          return result;
     } // end of toArray

     /**
      * Sees whether the bag is full
      * @return true if the bag is full, false if not
      */
     public boolean isFull(){
          return numberOfEntries == bag.length;
     } // end of isFull

     /**
      * Sees whether this bag is empty
      * @return true if bag is empty; false if not
      */
     public boolean isEmpty() {
          return numberOfEntries == 0;
     } // end of isEmpty

     /**
      * Gets the current number of entries in this bag
      * @return integer number of entries in current bag
      */
     public int getCurrentSize() {
          return numberOfEntries;
     } // end of getCurrentSize

     /**
      * Counts the number of times a given entry appears in this bag
      * @param anEntry the entry to be counted
      * @return the number of times anEntry appears in the bag
      */
     public int getFrequencyOf(T anEntry) {
          int counter = 0;
          for (int index = 0; index < numberOfEntries; index++) {
               if (anEntry.equals(bag[index])) {
                    counter++;
               } // end if
          } // end for
          return counter;
     } // end of getFrequencyOf
     public boolean contains(T anEntry) {
          return getIndexOf(anEntry) > -1;
     } // end of contains
} // end of ArrayBag
