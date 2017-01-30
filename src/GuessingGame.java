
/**
 * Created by JoshuaK on 1/30/2017.
 */

public class GuessingGame {

     private DecisionTreeInterface tree;
     public GuessingGame(String question, String noAnswer, String yesAnswer) {
          DecisionTree no = new DecisionTree(noAnswer);
          DecitionTree yes = new DecisionTree(yesAnswer);
          tree = new DecisionTree(question, no, yes);
     } // end default constructor

     public void play() {
          tree.reset();
          while (!tree.isAnswer()) {
               // ask current question
               System.out.println(tree.getCurrentData());
               if (Client.isUserResponseYes())
                    tree.advanceToYes();
               else
                    tree.advanceToNo();
          } // end while
          assert tree.isAnswer(); // assertion: leaf is reached
          // make guess
          System.out.println("My guess is " + tree.getCurrentData() + ". Am I right?");
          if (Client.isUserResponseYes())
               System.out.println("I win.");
          else
               learn();
     } // end play


} // end GuessingGame