/**
 * Created by joshkennede on 1/24/17.
 */
public class LinkedQueue<T> implements QueueInterface<T> {

    private Node firstNode; // ref to node at front of queue
    private Node lastNode; // ref to node at back of queue

    public LinkedQueue() {
        firstNode = null;
        lastNode = null;
    } // end default constructor

    /**
     * Private inner class
     */
    private class Node {
        private T data; // entry in bag
        private Node next; //link to next node

        private Node(T dataPortion) {
            this(dataPortion, null);
        } //end constructor
        private Node(T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        } // end constructor
        private T getData() {
            return data;
        } // end getData
        private void setData(T newData) {
            data = newData;
        } // end setData
        private Node getNextNode() {
            return next;
        } // end getNextNode
        private void setNextNode(Node nextNode) {
            next = nextNode;
        } // end setNextNode
    } // end Node

    /**
     * Adds a new entry to front of the queue
     * @param newEntry an object to be added
     */
    public void enqueue(T newEntry) {
        Node newNode = new Node(newEntry, null);
        if (isEmpty())
            firstNode = newNode;
        else
            lastNode.setNextNode(newNode);
        lastNode = newNode;
    } // end enqueue

    /**
     * Removes the front entry
     * @return
     */
    public T dequeue() {
        T front = null;
        if (!isEmpty()) {
            front = firstNode.getData();
            firstNode = firstNode.getNextNode();
            if (firstNode == null)
                lastNode = null;
        } // end if
        return front;
    } // end dequeue
    /**
     * Gets the front entry of the queue
     * @return the front entry
     */
    public T getFront() {
        T front = null;
        if (!isEmpty())
            front = firstNode.getData();
        return front;
    } // end getFront

    /**
     * Sees whether the queue is empty
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return (firstNode == null) && (lastNode == null);
    } // end isEmpty

    public void clear() {
        firstNode = null;
        lastNode = null;
    } // end clear
} // end LinkedQueue
