/**
 * Created by Joshuak on 1/23/2017.
 */
public class ArrayBagDemo1 {
     public static void main(String args[]) {
          // bag that isn't full
          BagInterface<String> aBag = new ArrayBag<String>() {
               @Override
               public boolean remove(String anEntry) {
                    return false;
               }
               @Override
               public int getFrequencyOf(String anEntry) {
                    return 0;
               }
          };
          // tests on a empty bag
          testIsFull(aBag, false);
          // adding strings
          String[] contentsOfBag1 = {"A","A","B","A","C","A"};
          testAdd(aBag, contentsOfBag1);
          testIsFull(aBag, false);
          // a bag that will be full
          System.out.println("\nA new empty bag:");
          // test on an empty bag
          testIsFull(aBag, false);
          // adding strings
          String[] contentsOfBag2 = {"A","B","A","C","B","C","D"};
          testAdd(aBag, contentsOfBag2);
          testIsFull(aBag, true);
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
     private static void displayBag(BagInterface<String> aBag) {
          System.out.println("The bag contains the following string(s):");
          Object[] bagArray = aBag.toArray();
          for (int index = 0; index < bagArray.length; index++) {
               System.out.print(bagArray[index] + " ");
          } // end for
     } // end displayBag
} // end of ArrayBagDemo1
