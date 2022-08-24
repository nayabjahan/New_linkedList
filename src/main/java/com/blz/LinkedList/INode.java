package com.blz.LinkedList;

public interface INode<k> {

    void setKey(k key);
    k getKey();

    void setNext(INode<k> next);
    INode<k> getNext();
}
