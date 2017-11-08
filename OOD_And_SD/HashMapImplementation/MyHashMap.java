package HashMapImplementation;

import java.util.Arrays;

public class MyHashMap<K, V> {
    public static class Node<K, V> {
        private final K key;
        private V value;
        private Node<K, V> next = null;

        public Node (K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    private static final int initCapacity = 15;
    private static final double loadFactor = 0.7;
    private Node<K, V>[] array;
    private int size;

    public MyHashMap() {
        array = (Node<K, V>[])new Node[initCapacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        Arrays.fill(array, null);
        size = 0;
    }

    public V get(K key) {
        Node<K, V> node = array[getIndex(key)];
        while (node != null) {
            if (equalsKey(node.getKey(), key)) {
                return node.getValue();
            }
            node = node.next;
        }
        return null;
    }

    public boolean containsKey(K key) {
        Node<K, V> node = array[getIndex(key)];
        while (node != null) {
            if (equalsKey(node.getKey(), key)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public V put(K key, V value) {
        int index = getIndex(key);
        Node <K, V> head = array[index];
        while (head != null) {
            if (equalsKey(head.getKey(), key)) {
                V oldValue = head.getValue();
                head.setValue(value);
                return oldValue;
            }
            head = head.next;
        }
        Node <K, V> newNode = new Node<>(key, value);
        newNode.next = head;
        array[index] = newNode;
        size++;

        if (size > loadFactor * array.length) {
            reHash();
        }
        return null;
    }

    public V remove(K key) {
        int index = getIndex(key);
        Node<K, V> pre = null;
        Node<K, V> cur = array[index];
        while (cur != null) {
            if (equalsKey(cur.getKey(), key)) {
                if (pre == null) {
                    array[index] = cur.next;
                } else {
                    pre.next = cur.next;
                }
                size--;
                return cur.getValue();
            }
            pre = cur;
            cur = cur.next;
        }
        return null;
    }

    private int getIndex(K key) {
        if (key == null) {
            return 0;
        }
        int hashCode = key.hashCode();
        return (hashCode & 0x7fffffff) % array.length;
    }

    private boolean equalsKey(K k1, K k2) {
        if (k1 != null && k2 != null) {
            return k1.equals(k2);
        }
        if (k1 == null && k2 == null) {
            return true;
        }
        return false;
    }

    private void reHash() {
        Node<K, V>[] old = array;
        array = (Node<K, V>[]) new Node[old.length * 2];
        for (Node<K, V> head : old) {
            // all nodes int each bucket need to rehash
            while (head != null) {
                Node<K, V> next = head.next;
                int index = getIndex(head.getKey());
                head.next = array[index];
                array[index] = head;
                head = next;
            }
        }
    }
}
