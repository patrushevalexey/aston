package module2.myHashSet;

import java.util.Objects;

public class MyHashSet<E> {
    private static class Node<E> {
        E key;
        Node<E> next;

        Node(E key) {
            this.key = key;
        }
    }

    private Node<E>[] table;
    private int capacity = 16;

    public MyHashSet() {
        table = new Node[capacity];
    }

    private int hash(E key) {
        return (key == null) ? 0 : Math.abs(key.hashCode() % capacity);
    }

    public void add(E key) {
        int index = hash(key);
        Node<E> current = table[index];

        while (current != null) {
            if (Objects.equals(current.key, key)) {
                return; // уже есть
            }
            current = current.next;
        }

        Node<E> newNode = new Node<>(key);
        newNode.next = table[index];
        table[index] = newNode;
    }

    public void remove(E key) {
        int index = hash(key);
        Node<E> current = table[index];
        Node<E> prev = null;

        while (current != null) {
            if (Objects.equals(current.key, key)) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public boolean contains(E key) {
        int index = hash(key);
        Node<E> current = table[index];

        while (current != null) {
            if (Objects.equals(current.key, key)) return true;
            current = current.next;
        }
        return false;
    }
}
