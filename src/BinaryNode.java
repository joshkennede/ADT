/**
 * Created by JoshuaK on 1/30/2017.
 */
public class BinaryNode {
     public BinaryNodeInterface copy() {
          BinaryNode newRoot = new BinaryNode(data);
          if (left != null)
               newRoot.left = (BinaryNode)left.copy();
          if (right != null)
               newRoot.right = (BinaryNode)right.copy();
          return newRoot;
     } // end copy

     public int getHeight() {
          return getHeight(this);
     } // end getHeight

     private int getHeight() {
          int height = 0;
          if (node != null)
               height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
          return height;
     } // end getHeight
} // end BinaryNode
