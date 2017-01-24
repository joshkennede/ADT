/**
 * Created by Joshuak on 1/23/2017.
 */
public class LinkedBagDemo1 {
     public static void main(String args[]) {
          System.out.println("Creating an empty bag.");
          BagInterface<String> aBag = new LinkedBag<String>() {
               @Override
               public int getCurrentSize() {
                    return 0;
               }
               @Override
               public boolean isFull() {
                    return false;
               }
               @Override
               public boolean isEmpty() {
                    return false;
               }
               @Override
               public String remove() {
                    return null;
               }
               @Override
               public boolean remove(String anEntry) {
                    return false;
               }
               @Override
               public void clear() {
               }
               @Override
               public int getFrequencyOf(String anEntry) {
                    return 0;
               }
               @Override
               public boolean contains(String anEntry) {
                    return false;
               }
          };
          testIsEmpty(aBag, true);
          displayBag(aBag);
          String[] contentsOfBag = {"A","D","B","A","C","A","D"};
          testAdd(aBag,contentsOfBag);
          testIsEmpty(aBag, false);
          testIsFull(aBag, false);
     } // end main
     private static void testAdd(BagInterface<String> aBag, String[] content) {
          System.out.println("Adding to the bag: ");
          for (int index = 0; index < content.length; index++) {
               aBag.add(content[index]);
               System.out.print(content[index] + " ");
          } // end for
          System.out.println();
          displayBag(aBag);
     } // end testAdd
     private static void testIsFull(BagInterface<String> aBag, boolean correctResult) {
          System.out.print("\nTesting the method isFull with ");
          if (correctResult)
               System.out.println("a full bag");
          else
               System.out.println("a bag that is not full");
          System.out.print("isFull finds the bag ");
          if (correctResult && aBag.isFull())
               System.out.println("full: OK.");
          else if (correctResult)
               System.out.println("not full, but is is full: ERROR.");
          else if (!correctResult && aBag.isFull())
               System.out.println("full, but is is not full: ERROR.");
          else
               System.out.println("not full: OK.");
     } // end testIsFull
     private static void testIsEmpty(BagInterface<String> aBag, boolean correctResult) {
          System.out.print("\nTesting the method isEmpty with ");
          if (correctResult)
               System.out.println("a full bag");
          else
               System.out.println("a bag that is not full");
          System.out.print("isEmpty finds the bag ");
          if (correctResult && aBag.isEmpty())
               System.out.println("full: OK.");
          else if (correctResult)
               System.out.println("not full, but is is full: ERROR.");
          else if (!correctResult && aBag.isEmpty())
               System.out.println("full, but is is not full: ERROR.");
          else
               System.out.println("not full: OK.");
     } // end testIsFull
     private static void displayBag(BagInterface<String> aBag) {
          System.out.println("The bag contains the following string(s):");
          Object[] bagArray = aBag.toArray();
          for (int index = 0; index < bagArray.length; index++) {
               System.out.print(bagArray[index] + " ");
          } // end for
     } // end displayBag
} // end of LinkedBagDemo1