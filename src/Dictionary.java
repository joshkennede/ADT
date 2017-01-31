/*

import java.util.Iterator;

public class Dictionary<K extends Comparable<? super K>, V> implements DictionaryInterface<K, V> {
    private SearchTreeInterface<Entry<K, V>> bst;
    public Dictionary() {
        bst = new BinarySearchTree<Entry<K, V>> ();
    } // end default constructor

    private class Entry<S extends Comparable<? super S>, T> implements Comparable<Entry<S, T>> {
        private S key;
        private T value;
        private Entry(S searchKey, T dataValue) {
            key = searchKey;
            value = dataValue;
        } // end constructor
        public int compareTo(Entry<S, T> other) {
            return key.compareTo(other.key);
        } // end compareTo
    } // end Entry

    public V add(K key, V value) {
        Entry<K, V> newEntry = new Entry<K, V>(key, value);
        Entry<K, V> returnedEntry = bst.add(newEntry);
        V result = null;
        if (returnedEntry != null)
            result = returnedEntry.getValue();
        return result;
    } // end add
    public V remove(K key) {
        Entry<K, V> findEntry = new Entry<K, V>(key, null);
        Entry<K, V> returnedEntry = bst.remove(findEntry);
        return // something
    } // end remove
} // end Dictionary*/
