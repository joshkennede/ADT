import java.util.Arrays;

/**
 * Created by JoshuaK on 1/24/2017.
 */
public class ArrayStack<T> implements StackInterface<T> {
     private T[] stack; // array of stack entries
     private int topIndex; // index of top entry
     private static final int DEFAULT_INITIAL_CAPACTIY = 50;

     public ArrayStack() {
          this(DEFAULT_INITIAL_CAPACTIY);
     } // end default constructor
     public ArrayStack(int initialCapacity) {
          // cast is safe because new array contains null entries
          @SuppressWarnings("unchecked")
          T[] tempStack = (T[]) new Object[initialCapacity];
          stack = tempStack;
          topIndex = -1;
     } // end constructor

     /**
      * Checks to see if there is room to add to the top of the stack
      * If not, the stack capacity is doubled
      */
     private void ensureCapacity() {
          if (topIndex == stack.length -1) // if array is full
          stack = Arrays.copyOf(stack, 2 * stack.length); // double size of array
     } // end ensureCapacity

     /**
      * Adds a new entry to the top of the stack
      * @param newEntry the element to add to the stack
      */
     public void push(T newEntry) {
          ensureCapacity();
          topIndex++;
          stack[topIndex] = newEntry;
     } // end push

     /**
      * Returns the top element of the stack
      * @return the top element
      */
     public T peek() {
          T top = null;
          int index = 0;
          if (!isEmpty())
               top = stack[index];
          return top;
     } // end peek

     /**
      * Removes and returns the top element in the stack
      * @return top element of the stack
      */
     public T pop() {
          T top = null;
          int index = 0;
          if (!isEmpty()) {
               top = stack[index];
               stack[topIndex] = null;
               topIndex--;
          } // end if
          return top;
     } // end pop

     /**
      * Sees whether the stack is empty.
      * @return true if empty, false if not
      */
     public boolean isEmpty() {
          return topIndex < 0;
     } // end isEmpty

     /**
      * Clears stack of all entries
      */
     public void clear() {
          while (!isEmpty()) {
               topIndex = -1;
          } // end while
     } // end clear
} // end ArrayStack