/**
 * Created by joshkennede on 1/27/17.
 *//*

public class SortedLinkedList<T extends Comparable<? super T>> implements SortedListInterface<T> {

    private Node firstNode; // reference to first node of chain
    private int numberOfEntries; // reference to entries in chain

    public SortedLinkedList() {
        firstNode = null;
        numberOfEntries = 0;
    } // end default constructor

    */
/** Finds the node that is before the node that should or does contain a given entry.
     @param anEntry the object to be located
     @return either a reference to the node that is before the node
     that contains or should contain anEntry, or null if
     no prior node exists (that is, if anEntry belongs at
     the beginning of the list) *//*

    private Node getNodeBefore(T anEntry)
    {
        Node currentNode = firstNode;
        Node nodeBefore = null;
        while ( (currentNode != null) &&(anEntry.compareTo(currentNode.getData()) > 0) )
        {
            nodeBefore = currentNode;
            currentNode = currentNode.getNextNode();
        } // end while
        return nodeBefore;
    } // end getNodeBefore

    public void add(T newEntry) {
        Node newNode = new Node(newEntry);
        Node nodeBefore = getNodeBefore(newEntry);
        if (isEmpty() || (nodeBefore == null)) // add at beginning
        {
            newNode.setNextNode(firstNode);
            firstNode = newNode;
        }
        else // add after nodeBefore
        {
            Node nodeAfter = nodeBefore.getNextNode();
            newNode.setNextNode(nodeAfter);
            nodeBefore.setNextNode(newNode);
        } // end if
        numberOfEntries++;
    } // end add

    */
/*//*
/ Recursive add()
    public void add(T newEntry)
    {
        firstNode = add(newEntry, firstNode);
        numberOfEntries++;
    } // end add
    private Node add(T newEntry, Node currentNode)
    {
        if ( (currentNode == null) || (newEntry.compareTo(currentNode.getData()) <= 0) )
        {
            currentNode = new Node(newEntry, currentNode);
        }
        else
        {
            Node nodeAfter = add(newEntry, currentNode.getNextNode());
            currentNode.setNextNode(nodeAfter);
        } // end if
        return currentNode;
    } // end add*//*


    public boolean contains(T anEntry)
    {
        boolean found = false;
        for (int index = 0; !found && (index < numberOfEntries); index++)
        {
            Object[] list = null;
            if (anEntry.equals(list[index]))
                found = true;
        } // end for
        return found;
    } // end contains

*/
/*    // Recursive contains()
    *//*
*/
/** Searches the list for anEntry. *//*
*/
/*
    public boolean contains(T anEntry) {
        return search(0, numberOfEntries - 1, anEntry);
    } // end contains
    *//*
*/
/** Searches list[first] through list[last] for desiredItem.
     @param first an integer index >= 0 and < numberOfEntries
     @param last an integer index >= 0 and < numberOfEntries
     @param desiredItem the object to be found
     @return true if desiredItem is found *//*
*/
/*
    private boolean search(int first, int last, T desiredItem) {
        boolean found;
        if (first > last)
            found = false; // no elements to search
        else if (desiredItem.equals(list[first]))
            found = true;
        else
            found = search(first + 1, last, desiredItem);
        return found;
    } // end search *//*



    private class Node {
        private T data; // entry in stack
        private Node next; // link to get next node

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
} // end SortedLinkedList
*/
