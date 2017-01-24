/**
 * Created by Joshuak on 1/23/2017.
 */

import jdk.nashorn.internal.ir.WhileNode;

/**
 * A class of bags whose entries ar stored in a chain of linked nodes
 * The bag is never full
 */
public abstract class LinkedBag<T> implements BagInterface<T> {
     private Node firstNode;
     private int numberOfEntries;
     public LinkedBag() {
          firstNode = null;
          numberOfEntries = 0;
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
     } // end Node

     /**
      * Adds a new entry to this bag
      * @param newEntry the object to added as new entry
      * @return true
      */
     public boolean add(T newEntry) {
          Node newNode = new Node(newEntry);
          newNode.next = firstNode; // make a new node reference the rest of the chain
          firstNode = newNode; // new node is at beginning of chain
          numberOfEntries++;
          return true;
     } // end add

     /**
      * Removes one unspecified entry from this bag if possible
      * @return either the removed object if removal was successful or null
      */
     public T remove() {
          T result = null;
          if (firstNode != null) {
               result = firstNode.data;
               firstNode = firstNode.next;
               numberOfEntries--;
          } // end if
          return result;
     } // end remove

     /**
      * Removes one occurrence of a given entry from this bag
      * @param anEntry the entry to be removed
      * @return true if removal is successful, false if not
      */
     public boolean remove(T anEntry) {
          boolean result = false;
          Node nodeN = getReferenceTo(anEntry);
          if (nodeN != null) {
               nodeN.data = firstNode.data; // replace located entry with entry in first node
               remove();
               result = true;
          } // end if
          return result;
     } // end remove

     /**
      * Locates a given entry within this bag
      * @param anEntry
      * @return a reference to the node containing the entry, if located
      */
     private Node getReferenceTo(T anEntry) {
          boolean found = false;
          Node currentNode = firstNode;
          while (!found && (currentNode != null)) {
               if (anEntry.equals(currentNode.data))
                    found = true;
               else
                    currentNode = currentNode.next;
          } // end while
          return currentNode;
     } // end getReferenceTo

     /**
      * Retrieves all entries that are in the bag
      * @return a newly allocated array of all the entries in the bag
      */
     public T[] toArray() {
          @SuppressWarnings("unchecked")
                  T[] result = (T[]) new Object[numberOfEntries]; // unchecked cast
          int index = 0;
          Node currentNode = firstNode;
          while ((index < numberOfEntries) && (currentNode != null)) {
               result[index] = currentNode.data;
               index++;
               currentNode = currentNode.next;
          } // end while
          return result;
     } // end toArray

     /**
      * Counts the number of times a given entry appears in this bag
      * @param anEntry the entry to be counted
      * @return the number of times anEntry appears in the bag
      */
     public int getFrequencyOf(T anEntry) {
          int frequency = 0;
          int counter = 0;
          Node currentNode = firstNode;
          while ((counter < numberOfEntries) && (currentNode != null)) {
               if (anEntry.equals(currentNode.data))
                    frequency++;
                    counter++;
               currentNode = currentNode.next;
          } // end while
          return frequency;
     } // end getFrequencyOf

     /**
      * Tests whether this bag contains a given entry
      * @param anEntry the entry to locate
      * @return true if the bag contains anEntry, or false otherwise
      */
     public boolean contains(T anEntry) {
          boolean found = false;
          Node currentNode = firstNode;
          while (!found && (currentNode != null)) {
               if (anEntry.equals(currentNode.data))
                    found = true;
               else
                    currentNode = currentNode.next;
          } // end while
          return found;
     } // end contains

} // end of LinkedBag