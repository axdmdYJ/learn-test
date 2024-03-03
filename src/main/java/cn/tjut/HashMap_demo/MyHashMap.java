package cn.tjut.HashMap_demo;

import org.w3c.dom.Node;

public class MyHashMap<K, V> {

    private Node<K, V>[] table;

    private int size;

    public MyHashMap() {
        this.table = new Node[16];
    }

    static class Node<K, V> {
        int hash;

        K key;

        V value;

        Node next;

        @Override
        public String toString() {
            return new StringBuilder()
                    .append("[")
                    .append(key)
                    .append(",")
                    .append(value)
                    .append("]")
                    .toString();
        }


        public Node(int hash, K key, V value, Node next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;


        }
    }

    public V put(K key, V value) {
        // 处理key为null的情况
        if (key == null) {
            return putForNullKey(value);
        }
        // 不为null，取对应位置
        int index = Math.abs(key.hashCode()) % table.length;
        Node<K, V> node = table[index];

        // 如果对应位置上没有值
        if (null == table[index]) {
            table[index] = new Node<K, V>(key.hashCode(), key, value, null);
            size++;
            return value;
        }
        // 如果有链表
        Node<K, V> pre = node;
        while (node != null) {
            if (key.equals(node.key)) {
                V oldValue = node.value;
                node.value = value;
                return oldValue;
            }
            pre = node;
            node = node.next;
        }
        pre.next = new Node<>(key.hashCode(), key, value, null);
        size++;
        return value;
    }

    private V putForNullKey(V value) {
        Node<K, V> node = table[0];
        if (node == null) {
            table[0] = new Node<>(0, null, value, null);
            size++;
            return value; // 返回新值
        }
        // 说明有单向链表
        Node<K, V> pre = node;
        while (node != null) {
            if (node.key == null) {
                V oldValue = node.value;
                node.value = value; // 覆盖原有的值
                return oldValue;
            }
            pre = node;
            node = node.next;
        }
        // node为null后
        pre.next = new Node<K, V>(0, null, value, null);
        return value;  // 返回新值
    }

    /**
     * get方法
     */
    public V get(K key) {
        // key为null
        if (null == key) {
            Node<K, V> node = table[0];
            if (node == null) {
                return null;
            }
            // 存在链表
            while (node != null) {
                if (null == node.key) {
                    return node.value;
                }
                node = node.next;
            }
        }
        // key不是null
        int hash = key.hashCode();
        int index = Math.abs(hash % 16);
        Node<K, V> node = table[index];
        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        // 不存在key
        return null;
    }

    /**
     * 重写toString方法，输出map集合时会调用
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            Node<K, V> node = table[i];
            while (node != null) {
                sb.append(node);
                node = node.next;
            }
        }
        return sb.toString();
    }
}


