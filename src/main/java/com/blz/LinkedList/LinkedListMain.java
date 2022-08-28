package com.blz.LinkedList;
public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("----- Welcome to Data Structure: Linked List -----");
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.addNode(firstNode);
        myLinkedList.append(thirdNode);
        System.out.println("Inserting 30 between 56 and 70");
        myLinkedList.insertNode(firstNode, secondNode);
        System.out.println("Linked list before deletion: ");
        myLinkedList.display();

        MyNode searchedKey = myLinkedList.search(30);
        if(searchedKey.getKey().equals(30)) {
            System.out.println("Key Found");
        }
        else {
            System.out.println("Key Not Found");
        }
        myLinkedList.display();

    }
}



