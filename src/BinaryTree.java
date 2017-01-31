/*import jdk.nashorn.internal.ir.BinaryNode;
import java.util.Iterator;
import java.util.NoSuchElementException;

*//**
 * Created by JoshuaK on 1/30/2017.
 *//*
public class BinaryTree<T> implements BinaryTreeInterface<T> {

     private BinaryNodeInterface root;
     public BinaryTree() {
          root = null;
     } // end default constructor

     public BinaryTree(T rootData) {
          root = new BinaryNode(rootData);
     } // end constructor

     public BinaryTree(T rootData, BinaryTree leftTree, BinaryTree rightTree) {
          privateSetTree(rootData, leftTree, rightTree);
     } // end constructor

     public void setTree(T rootData) {
          root = new BinaryNode(rootData);
     } // end setTree

     public void setTree(T rootData, BinaryTreeInterface leftTree, BinaryTreeInterface rightTree) {
          privateSetTree(rootData, (BinaryTree)leftTree, (BinaryTree) rightTree);
     } // end setTree

     private void privateSetTree(T rootData, BinaryTree leftTree, BinaryTree rightTree) {
          root = new BinaryTreeNode(rootData);
          if ((leftTree != null) && (!leftTree.isEmpty()))
               root.setLeftChild(leftTree.root.copy());
          if ((rightTree != null) && (!rightTree.isEmpty())) {
               if (rightTree != leftTree)
                    root.setRightChild(rightTree.root);
               else
                    root.setRightChild(rightTree.root.copy());
          } // end if
          if ((leftTree != null) && (leftTree != this))
               leftTree.clear();
          if ((rightTree != null) && (rightTree != this))
               rightTree.clear();
     } // end privateSetTree

     public T getRootData() {
          T rootData = null;
          if (root != null)
               rootData = rootData.getData();
          return rootData;
     } // end getRootData

     public boolean isEmpty() {
          return root == null;
     } // end isEmpty

     public void clear() {
          root = null;
     } // end clear

     protected void setRootData(T rootData) {
          root.setData(rootData);
     } // end setRootData

     protected void setRootNode(BinaryNodeInterface rootNode) {
          root = rootNode;
     } // end setRootNode

     protected BinaryNodeInterface getRootNode() {
          return root;
     } // end getRootNode

     public int getNumberOfNodes() {
          int leftNumber = 0;
          int rightNumber = 0;
          if (left != null)
               leftNumber = left.getNumberOfNodes();
          if (right != null)
               rightNumber = right.getNumberOfNodes();
          return 1 + leftNumber + rightNumber;
     } // end getNumberOfNodes
} // end BinaryTree*/
