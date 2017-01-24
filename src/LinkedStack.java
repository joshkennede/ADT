/**
 * Created by JoshuaK on 1/24/2017.
 */

public class LinkedStack<T> implements StackInterface<T> {
     private Node topNode;
     public LinkedStack() {
          topNode = null;
     } // end default constructor

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

     public void push(T anEntry) {
          T newEntry = null;
          Node newNode = new Node(newEntry, topNode);
          topNode = newNode;
     } // end push

     public T peek() {
          T top = null;
          if (topNode != null)
               top =topNode.getData();
          return top;
     } // end peek

     public T pop() {
          T top = peek();
          if (topNode != null)
               topNode = topNode.getNextNode();
          return top;
     } // end pop

     public boolean isEmpty() {
          return topNode == null;
     } // end isEmpty

     public void clear() {
          topNode = null;
     } // end clear
} // end LinkedStack