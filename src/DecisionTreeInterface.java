/**
 * Created by JoshuaK on 1/30/2017.
 */
public interface DecisionTreeInterface<T> {

     /**
      * Gets the data in the current node
      * @return the data object in the current node or,
      * null if the current node is null
      */
     public T getCurrentData();

     /**
      * Sets the dat in current node
      * Precondition: the current node is not null
      * @param newData the new data object
      */
     public void setCurrentData(T newData);

     /**
      * Sets the data in the current node creating children,
      * if they do not exist
      * Precondition: the current node is not null
      * @param answerForNo left child data object
      * @param answerForYes right child data object
      */
     public void setAnswers(T answerForNo, T answerForYes);

     /**
      * Sees whether the current node contains an answer
      * @return true if current node is a leaf or false,
      * if a non leaf
      */
     public boolean isAnswer();

     /**
      * Sets the current node to its left child
      * If the child does not exist, sets the current node to null
      * Precondition: The current node is not null
      */
     public void advanceToNo();

     /**
      * Sets the current node to its right child
      * If the child does not exist, sets the current node to null
      * Precondition: The current node is not null
      */
     public void advanceToYes();

     /**
      * Makes the root of tree the current node
      */
     public void reset();

} // end DecisionTreeInterface


