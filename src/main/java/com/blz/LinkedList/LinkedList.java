package com.blz.LinkedList;

public class LinkedList {
    public MyNode head;
    MyNode tail;
    int size;

    public void addNode(MyNode newNode) {
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void display() {
        INode current = head;
        if (head == null)
            System.out.println("Linked List is empty");
        System.out.println("Nodes Are");
        while (current != null) {
            if (current.getNext() != null) {
                System.out.print(current.getKey() + " -> ");
            } else {
                System.out.println(current.getKey());
            }
            current = current.getNext();
        }
    }

    public void append(MyNode newNode) {
        if (head == null) {
            head = newNode;
        }
        if (tail == null) {
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void insertNode(INode myNode, INode newNode) {

        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);

    }

    public MyNode deleteFirst() {
        MyNode temporaryNode = this.head;
        this.head = (MyNode) this.head.getNext();
        return temporaryNode;
    }

    public void popLast() {

        INode tempNode = this.head;
        if (this.head == this.tail) {
            System.out.println("single element found");
        } else {
            tempNode.getNext().getNext();
        } {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(null);
    }
}




