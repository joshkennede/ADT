/**
 * Created by joshkennede on 1/24/17.
 */
public class ArrayQueue<T> implements QueueInterface<T> {
    private T[] queue; //circular array of queue entries and one unused location
    private int frontIndex;
    private int backIndex;
    private static final int DEFAULT_INITIAL_CAPACITY = 50;

    public ArrayQueue() {
        this(DEFAULT_INITIAL_CAPACITY);
    } // end default constructor

    public ArrayQueue(int initialCapacity) {
        @SuppressWarnings("unchecked")
        T[] tempQueue = (T[]) new Object[initialCapacity + 1];
        queue = tempQueue;
        frontIndex = 0;
        backIndex = initialCapacity;
    } // end constructor

    private void ensureCapacity() {
        if (frontIndex == ((backIndex + 2) % queue.length)) { // if array is full
            T[] oldQueue = queue;
            int oldSize = oldQueue.length;
            @SuppressWarnings("unchecked")
                    T[] tempQueue = (T[]) new Object[2 * oldSize];
            queue = tempQueue;
            for (int index = 0; index < oldSize - 1; index++) {
                queue[index] = oldQueue[frontIndex];
                frontIndex = (frontIndex + 1) % oldSize;
            } // end for
            frontIndex = 0;
            backIndex = oldSize - 2;
        } // end if
    } // end ensureCapacity

    /**
     * Adds an entry to the front of the array queue
     * @param newEntry an object to be added
     */
    public void enqueue(T newEntry) {
        ensureCapacity();
        backIndex = (backIndex + 1) % queue.length;
        queue[backIndex] = newEntry;
    } // end enqueue

    /**
     * Returns the front entry in the array queue
     * @return front entry
     */
    public T getFront() {
        T front = null;
        if (!isEmpty())
            front = queue[frontIndex];
        return front;
    } // end getFront

    /**
     * Removes front entry from the array queue
     * @return the front entry
     */
    public T dequeue() {
        T front = null;
        if (!isEmpty()) {
            front = queue[frontIndex];
            queue[frontIndex] = null;
            frontIndex = (frontIndex + 1) % queue.length;
        } // end if
        return front;
    } // end dequeue

    /**
     * Checks to see if the array is empty
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return frontIndex == ((backIndex + 1) % queue.length);
    } // end isEmpty

    /**
     * Clears the array queue by calling dequeue()
     */
    public void clear() {
        while (!isEmpty())
            dequeue();
           // frontIndex = 0;
           // backIndex = 0;
    } // end clear
} // end ArrayQueue
