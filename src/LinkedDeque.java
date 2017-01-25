/**
 * Created by joshkennede on 1/24/17.
 */
public class LinkedDeque<T> implements DequeInterface<T> {

    private DLNode firstNode; // ref node for front of deque
    private DLNode lastNode; // ref node for back of deque

    public LinkedDeque() {
        firstNode = null;
        lastNode = null;
    } // end default constructor

    /**
     * Private inner class
     */
    private class Node {
        private T data; // entry in bag
        private Node next; // link to next node

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

        // need to write additional setters for below references

    } // end Node

    /**
     * Adds an entry to back of the deque
     * @param newEntry
     */
    public void addToBack(T newEntry) {
        DLNode newNode = new DLNode(lastNode, newEntry, null);
        if (isEmpty())
            firstNode = newNode;
        else
            lastNode.setNextNode(newNode);
        lastNode = newNode;
    } // end addToBack

    /**
     * Adds an entry to front of the deque
     * @param newEntry
     */
    public void addToFront(T newEntry) {
        DLNode newNode = new DLNode(null, newEntry, firstNode);
        if (isEmpty())
            lastNode = newNode;
        else
            firstNode.setPreviousNode(newNode);
        firstNode = newNode;
    } // end addToFront

    /**
     * Removes an entry from the front of the deque
     * @return entry removed
     */
    public T removeFront() {
        T front = null;
        if (!isEmpty()) {
            front = firstNode.getData();
            firstNode = firstNode.getNextNode();
            if (firstNode == null)
                lastNode = null;
            else
                firstNode.setPreviousNode(null);
        } // end if
        return front;
    } // end removeFront

    /**
     * Removes an entry from the back of the deque
     * @return entry removed
     */
    public T removeBack() {
        T back = null;
        if (!isEmpty()) {
            back = lastNode.getData();
            lastNode = lastNode.getPreviousNode();
            if (lastNode == null)
                firstNode = null;
            else
                lastNode.setNextNode(null);
        } // end if
        return back;
    } // end removeBack
} // end LinkedDeque
