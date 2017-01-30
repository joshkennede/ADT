/**
 * Created by JoshuaK on 1/30/2017.
 */
public interface TreeInterface<T> {
     // ADD some public methods...
     public T getRootData();
     public T getHeight();
     public T getNumberOfNodes();
     public boolean isEmpty();
     public void reset();
} // end TreeInterface