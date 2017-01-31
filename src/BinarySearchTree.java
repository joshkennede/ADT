/*
import java.util.Iterator;

*/
/**
 * Created by joshkennede on 1/30/17.
 *//*

public class BinarySearchTree<T extends Comparable<? super T>> extends BinaryTree<T> implements SearchTreeInterface<T> {
    public BinarySearchTree() {
        super();
    } // end default constructor
    public BinarySearchTree(T rootEntry) {
        super();
        setRootNode(new BinaryNode<T>(rootEntry));
    } // end constructor
    public void setTree(T rootData) { // disable setTree (see Segment 25.6)
        throw new UnsupportedOperationException();
    } // end setTree
    public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree) {
        throw new UnsupportedOperationException();
    } // end setTree

    // Adds newEntry to the nonempty subtree rooted at rootNode.
    private T addEntry(BinaryNodeInterface<T> rootNode, T newEntry) {
        assert rootNode != null;
        T result = null;
        int comparison = newEntry.compareTo(rootNode.getData());
        if (comparison == 0) {
            result = rootNode.getData();
            rootNode.setData(newEntry);
        }
        else if (comparison < 0) {
            if (rootNode.hasLeftChild())
                result = addEntry(rootNode.getLeftChild(), newEntry);
            else
                rootNode.setLeftChild(new BinaryNode<T>(newEntry));
        }
        else {
            assert comparison > 0;
            if (rootNode.hasRightChild())
                result = addEntry(rootNode.getRightChild(), newEntry);
            else
                rootNode.setRightChild(new BinaryNode<T>(newEntry));
        } // end if
        return result;
    } // end addEntry

    public T add(T newEntry)
    {
        T result = null;
        if (isEmpty())
            setRootNode(new BinaryNode<T>(newEntry));
        else
            result = addEntry(getRootNode(), newEntry);
        return result;
    } // end add

    // Iterative addEntry
    private T addEntry(T newEntry) {
        BinaryNodeInterface<T> currentNode = getRootNode();
        assert currentNode != null;
        T result = null;
        boolean found = false;
        while (!found) {
            T currentEntry = currentNode.getData();
            int comparison = newEntry.compareTo(currentEntry);
            if (comparison == 0) { // newEntry matches currentEntry;
                // return and replace currentEntry
                found = true;
                result = currentEntry;
                currentNode.setData(newEntry);
            }
            else if (comparison < 0) {
                if (currentNode.hasLeftChild())
                    currentNode = currentNode.getLeftChild();
                else {
                    found = true;
                    currentNode.setLeftChild(new BinaryNode<T>(newEntry));
                } // end if
            } else {
                assert comparison > 0;
                if (currentNode.hasRightChild())
                    currentNode = currentNode.getRightChild();
                else {
                    found = true;
                    currentNode.setRightChild(new BinaryNode<T>(newEntry));
                } // end if
            } // end if
        } // end while
        return result;
    } // end addEntry

    public T remove(T entry) {
        ReturnObject oldEntry = new ReturnObject(null);
        BinaryNodeInterface<T> newRoot = removeEntry(getRootNode(), entry,oldEntry);
        setRootNode(newRoot);
        return oldEntry.get();
    } // end remove
} // end BinarySearchTree
*/
