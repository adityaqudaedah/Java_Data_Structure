package com.data.generic_linkedlist;

public class Linkedlist<E> {
    private Node head;

    //node class
    private class Node{
        private E data;
        private Node next;
        //constructor
        Node (E item){
            this.data = item;
            this.next = null;
        }
        //getter for data
        public E getData(){
            return this.data;
        }
        //getter for next
        public Node getNext(){
            return this.next;
        }
    }
    //insert method
    public void insert(E item){
        Node p = head;
        Node node  = new Node(item);
        if(head == null ){
            head = node;
        }
        else{
            while(p.next!=null){
                p = p.next;
            }
            p.next = node;
        }
    }

    //show method
    public void show(){
        Node n = head;
        while(n.next!=null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    //Main method
    public static void main(String[] args) {
        Linkedlist<Double> list = new Linkedlist<>();

        list.insert(0.1);
        list.insert(0.3);

        list.show();
    }

}
