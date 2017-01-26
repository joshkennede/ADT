import java.util.Arrays;

/**
 * Created by JoshuaK on 1/25/2017.
 */

public class AList<T> implements ListInterface<T> {

     private T[] list; // array of list entries
     private int numberOfEntries;
     private static final int DEFAULT_INITIAL_CAPACITY = 25;

     public AList() {
          this(DEFAULT_INITIAL_CAPACITY); // call next constructor
     } // end default constructor

     public AList(int initialCapacity) {
          numberOfEntries = 0;
          @SuppressWarnings("unchecked")
          T[] tempList = (T[]) new Object[initialCapacity];
          list = tempList;
     } // end constructor

     private void ensureCapacity() {
          if (numberOfEntries == list.length)
               list = Arrays.copyOf(list, 2 * list.length);
     } // end ensureCapacity

     private void makeRoom(int newPosition) {
          assert (newPosition >= 1) && (newPosition <= numberOfEntries + 1);
          int newIndex = newPosition - 1;
          int lastIndex = numberOfEntries - 1;
          for (int index = lastIndex; index >= newIndex; index--)
               list[index + 1] = list[index];
     } // end makeRoom

     private void removeGap(int givenPosition) {
          assert (givenPosition >= 1) && (givenPosition < numberOfEntries);
          int removedIndex = givenPosition - 1;
          int lastIndex = numberOfEntries - 1;
          for (int index = removedIndex; index < lastIndex; index++)
               list[index] = list[index + 1];
     } // end removeGap

     public void add(T newEntry) {
          ensureCapacity();
          list[numberOfEntries] = newEntry;
          numberOfEntries++;
     } // end add

     public boolean add(int newPosition, T newEntry) {
          boolean isSuccessful = true;
          if ((newPosition >= 1) && (newPosition <= numberOfEntries + 1)) {
               ensureCapacity();
               makeRoom(newPosition);
               list[newPosition - 1] = newEntry;
               numberOfEntries++;
          } // end if
          else
               isSuccessful = false;
          return isSuccessful;
     } // end add

     public T remove(int givenPosition) {
          T result = null; // return value
          if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
               assert !isEmpty();
               result = list[givenPosition - 1]; // get entry to be removed
               // move subsequent entries toward entry to be removed
               // unless it is last in list
               if (givenPosition < numberOfEntries)
                    removeGap(givenPosition);
               numberOfEntries--;
          } // end if
          return result;
     } // end remove

     public void clear() {
          T result = null;
          while (!isEmpty()) {
               result = list[numberOfEntries - 1];
          } // end while
     } // end clear

     public boolean replace(int givenPosition, T newEntry) {
          boolean isSuccessful = true;
          if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
               assert !isEmpty();
               list[givenPosition - 1] = newEntry;
          } // end if
          else
               isSuccessful = false;
          return isSuccessful;
     } // end replace

     public T getEntry(int givenPosition) {
          T result = null;
          if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
               assert !isEmpty();
               result = list[givenPosition - 1];
          } // end if
          return result;
     } // end getEntry

     public boolean contains(T anEntry) {
          boolean found = false;
          for (int index = 0; !found && (index < numberOfEntries); index++) {
               if (anEntry.equals(list[index]))
                    found = true;
          } // end for
          return found;
     } // end contains

     public int getLength() {
          return numberOfEntries;
     } // end getLength

     public boolean isEmpty() {
          return numberOfEntries == 0; // or getLength() == 0
     } // end isEmpty

     public T[] toArray() {
          @SuppressWarnings("unchecked")
          T[] result = (T[]) new Object[numberOfEntries];
          for (int index = 0; index < numberOfEntries; index++) {
               result[index] = list[index];
          } // end for
          return result;
     } // end toArray
} // end AList