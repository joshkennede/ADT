/**
 * Created by JoshuaK on 1/25/2017.
 */
public interface ListInterface<T> {

     /**
      * Adds new entry to end of list. List size is increased by 1
      * @param newEntry object to be added to end of list
      */
     public void add(T newEntry);

     /**
      * Adds new entry to specified position within this list
      * Existing entries
      * @param newPosition an integer that specifies the desired position of new entry
      * @param newEntry object to be added as new entry
      * @return true if addition is successful, false if not
      */
     public boolean add(int newPosition, T newEntry);

     /**
      * Removes the entry at a given position from this list. List is decremented by 1
      * @param givenPosition indicates position to remove
      * @return reference to removed entry or null
      */
     public T remove(int givenPosition);

     /**
      * Removes all entries from list
      */
     public void clear();

     /**
      * Replaces the entry at a given position in this list
      * @param givenPosition an integer that indicates the position of the entry to be replaced
      * @param newEntry the object that will replace the entry at the given position
      * @return true if replacement occurs, false if otherwise
      */
     public boolean replace(int givenPosition, T newEntry);

     /**
      * Retrieves entry at given position in this list
      * @param givenPosition an integer that indicates the desired position
      * @return reference to the indicated entry or null
      */
     public T getEntry(int givenPosition);

     /**
      * Sees whether this list contains a given entry
      * @param anEntry the object that is the desired entry
      * @return true if list contains anEntry, false if otherwise
      */
     public boolean contains(T anEntry);

     /**
      * Gets the length of the list
      * @return integer number of entries in this list
      */
     public int getLength();

     /**
      * Sees whether this list is empty
      * @return true if empty, false if otherwise
      */
     public boolean isEmpty();

     /**
      * Retrieves all entries that are in this list in the order in which they occur in the list
      * @return
      */
     public T[] toArray();

} // end ListInterface
