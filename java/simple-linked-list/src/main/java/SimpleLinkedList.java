import java.util.*;

class SimpleLinkedList<T> {
    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head;
    
    SimpleLinkedList() {
        this.head = null;
    }

    SimpleLinkedList(T[] values) {
        for (T value : values) {
            push(value);
        }
    }

    void push(T value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    T pop() {
        if(head == null)
            throw new NoSuchElementException("Cannot pop from an empty list.");
        T value = head.data;
        head = head.next;
        return value;
    }

    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    T[] asArray(Class<T> clazz) {
        int size = size();
        T[] array = (T[]) java.lang.reflect.Array.newInstance(clazz, size);
        Node current = head;
        int index = 0;

        while (current != null) {
            array[index++] = current.data;
            current = current.next;
        }

        return array;
    }

    int size() {
        int size = 0;
        Node current = head;

        while (current != null) {
            size++;
            current = current.next;
        }

        return size;
    }
}
