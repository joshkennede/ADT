/**
 * Created by JoshuaK on 1/30/2017.
 */
public interface BinaryTreeInterface<T> extends TreeInterface, TreeIteratorInterface {

     public void setTree(T rootData);
     public void setTree(T rootData, BinaryTreeInterface leftTree, BinaryTreeInterface rightTree);
} // end BinaryTreeInterface