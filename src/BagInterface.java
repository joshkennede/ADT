/**
 * Created by Joshuak on 1/23/2017.
 */
public interface BagInterface<T> {

     /**
      * Gets the current number of entries in this bag
      * @return integer number of entries in current bag
      */
     public int getCurrentSize();

     /**
      * Sees whether this bag is full
      * @return true if bag is full; false if not
      */
     public boolean isFull();

     /**
      * Sees whether this bag is empty
      * @return true if bag is empty; false if not
      */
     public boolean isEmpty();

     /**
      * Adds new entry to this bag
      * @param newEntry the object to added as new entry
      * @return true if addition is successful; false if not
      */
     public boolean add(T newEntry);

     /**
      * Removes one unspecified entry from this bag, if possible
      * @return either removed entry if successful or null if not successful
      */
     public T remove();

     /**
      * Removes one occurrence of a given entry from this bag, if possible
      * @param anEntry the entry to be removed
      * @return true if removal is successful, false if not
      */
     public boolean remove(T anEntry);

     /**
      * Removes all entries from this bag
      */
     public void clear();

     /**
      * Counts the number of times a given entry appears in this bag
      * @param anEntry the entry to be counted
      * @return the number of times anEntry appears in the bag
      */
     public int getFrequencyOf(T anEntry);

     /**
      * Tests whether this bag contains a given entry
      * @param anEntry the entry to locate
      * @return true if the bag contains anEntry, or false otherwise
      */
     public boolean contains(T anEntry);

     /**
      * Creates an array of all entries that are in this bag
      * @return a newly allocated array of all the entries in the bag
      */
     public T[] toArray();

} // end of BagInterface
