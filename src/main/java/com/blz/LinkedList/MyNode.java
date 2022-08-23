package com.blz.LinkedList;

public class MyNode<k> {
    private k key;
    private MyNode next;

    public MyNode(k key) {
        this.key = key;
    }

    public k getKey() {
        return key;
    }
    public void setKey(k key) {
        this.key = key;
    }

    public MyNode getNext() {
        return next;
    }
    public void setNext(MyNode next) {
        this.next = next;
    }

    }

