package com.griddynamics.testAlgorithms.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("B");
        linkedList.addLast("C");
        linkedList.addLast("D");
        linkedList.addLast("E");
        System.out.println("LL: " + linkedList);
        linkedList.addFirst("A");
        System.out.println("LL: " + linkedList);

        System.out.println("Index of element with E: " + linkedList.get("E"));
        System.out.println("Index of element with ZZZ: " + linkedList.get("Z"));

        linkedList.remove("C");
        System.out.println("LL: " + linkedList);

    }
}
