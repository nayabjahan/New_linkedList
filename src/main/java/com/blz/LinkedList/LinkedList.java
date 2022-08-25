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
    public void append(MyNode newNode){
        if(head==null){
            head= newNode;
        }
        if(tail==null){
            tail=newNode;
        }else{
            tail.setNext(newNode);
            tail = newNode;
        }
    }
}
