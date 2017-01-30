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
} // end BinaryNode
