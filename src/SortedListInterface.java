/**
 * Created by joshkennede on 1/27/17.
 */

/** An interface for the ADT sorted list.
 Entries in the list have positions that begin with 1.
 */
public interface SortedListInterface<T extends Comparable<? super T>>
{
    /** Adds a new entry to this sorted list in its proper order.
     @param newEntry the object to be added as a new entry */
    public void add(T newEntry);
    /** Removes a specified entry from this sorted list.
     @param anEntry the object to be removed
     @return true if anEntry was located and removed */
    public boolean remove(T anEntry);
    /** Gets the position of an entry in this sorted list.
     @param anEntry the object to be found
     @return the position of the first or only occurrence of anEntry
     if it occurs in the list; otherwise returns the position
     where anEntry would occur in the list, but as a negative
     integer */
    public int getPosition(T anEntry);
    // as part of the ADT list:
    public T getEntry(int givenPosition);
    public boolean contains(T anEntry);
    public T remove(int givenPosition);
    public void clear();
    public int getLength();
    public boolean isEmpty();
    public T[] toArray();
} // end SortedListInterface
