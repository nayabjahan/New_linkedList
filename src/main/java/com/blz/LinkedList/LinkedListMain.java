package com.blz.LinkedList;
public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("----- Welcome to Data Structure: Linked List -----");
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        MyNode<Integer> nodeToBeInserted = new MyNode<Integer>(40);
        int valueOfPreviousNode = 30;
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.addNode(firstNode);
        myLinkedList.append(thirdNode);
        System.out.println("Inserting 30 between 56 and 70");
        myLinkedList.insertNode(firstNode, secondNode);
        System.out.println("Linked list before deletion: ");
        myLinkedList.display();

        myLinkedList.insertWithKey(valueOfPreviousNode, nodeToBeInserted);
        myLinkedList.display();



    }
}



