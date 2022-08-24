package com.blz.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Linked list 1 using add");
        MyNode<Integer> firstNode = new MyNode<Integer>(70);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(56);
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.addNode(firstNode);
        myLinkedList.addNode(secondNode);
        myLinkedList.addNode(thirdNode);
        myLinkedList.display();
    }
}

