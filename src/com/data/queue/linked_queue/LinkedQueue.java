package com.data.queue.linked_queue;


import java.util.NoSuchElementException;

public class LinkedQueue<E> implements Queue<E> {
    private Node front;
    private Node rear;

    @Override
    public void enqueu(E item) {

//        Node r = rear;
        Node node = new Node(item);
        if (front==null){
            front = node;
        }
        else {
            rear.next = node;
        }
        rear = node;
    }

    @Override
    public E dequeue() {
        E result = front.getData();
        front = front.next;
        return result;
    }

    @Override
    public E peek() {
        return front.data;
    }

    @Override
    public int size() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int count = 1;
        Node tmp = front;
        while(tmp.next!=null){
            tmp = tmp.next;
            count++;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    //show method
    public void show(){
        Node temp = front;
        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
    //node class
    private class Node {
        private final E data;
        private Node next;

        //first constructor
        Node(E item, Node node) {
            this.data = item;
            this.next = node;
        }
        //second constructor
        Node(E item){
            this(item,null);
        }
        //getter data
        public E getData() {
            return data;
        }
        //getter node
//        public Node getNext() {
//            return next;
//        }
    }
}