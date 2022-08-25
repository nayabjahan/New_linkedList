package com.blz.LinkedList;
public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Linked List using add ");
        MyNode<Integer> firstNode = new MyNode<Integer>(70);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(56);
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.addNode(firstNode);
        myLinkedList.addNode(secondNode);
        myLinkedList.addNode(thirdNode);
        myLinkedList.display();
        System.out.println("............++++++++...............");

        System.out.println("appending nodes");
        MyNode<Integer> node1 = new MyNode<Integer>(56);
        MyNode<Integer> node2 = new MyNode<Integer>(30);
        MyNode<Integer> node3 = new MyNode<Integer>(70);
        LinkedList myLinkedList1 = new LinkedList();
        myLinkedList1.addNode(node1);
        myLinkedList1.addNode(node2);
        myLinkedList1.addNode(node3);
        myLinkedList1.display();

    }

}

