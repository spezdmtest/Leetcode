package com.griddynamics.testAlgorithms.LinkedList;

public class LinkedList<T> {
    private Node<T> head;

    public void addFirst(T t) {
        Node<T> firstNode = new Node<>(t);
        firstNode.next = head;
        head = firstNode;
    }

    public void addLast(T t) {
        if (head == null) {
            head = new Node<>(t);
            return;
        }

        Node<T> currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node<>(t);
    }

    public int get(T t) {
        if (head == null) {
            return -1;
        }
        if (head == t) {
            return 0;
        }

        Node<T> currentNode = head;
        int result = 0;
        while (currentNode.next != null) {
            ++result;
            if (currentNode.next.value == t) {
                return result;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }

    public void remove(T t) {
        if (head == null) {
            return;
        }
        if (head.value == t) {
            head = head.next;
            return;
        }

        Node<T> currendNode = head;
        while (currendNode.next != null) {
            if (currendNode.next.value == t) {
                currendNode.next = currendNode.next.next;
                return;
            }
            currendNode = currendNode.next;
        }


    }

    private static class Node<T> {
        private final T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
