package com.data.generic_stack;

public class Node<T> {
    private T data;
    private Node<T> next;

    //constructor
    Node(T item, Node<T> next){
        this.data = item;
        this.next = next;
    }
    //getter method for data
    public T getData(){
        return data;
    }
    //getter for next
    public Node<T> getNext(){
        return next;
    }
    //setter method for data
    public void setData(T item){
        this.data = data;
    }
    //setter method for next
    public void setNext(Node<T> item){
        this.next = item;
    }

}
