/**
 * Created by JoshuaK on 1/24/2017.
 */

public class LinkedStack<T> implements StackInterface<T> {
     private Node topNode;
     public LinkedStack() {
          topNode = null;
     } // end default constructor

     public void push(T anEntry) {
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

     private class Node {
          private T data; // entry in stack
          private Node next; // link to get next node
     } // end Node
} // end LinkedStack
