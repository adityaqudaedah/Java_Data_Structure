package com.data.stack;

import java.util.EmptyStackException;

//Linked list stack
class IntLinkedStack{

    private  Node top;

    //push method
    public void push(int item){
        top = new Node(item,top);
    }
    //pop method
    public int pop(){
        if(top==null){
            throw new EmptyStackException();
        }
        else {
            int result = top.data;
            top = top.next;
            return result;
        }
    }
    //Is empty method
    public boolean isEmpty(){
        if(top == null){
            throw new EmptyStackException();
        }
        else{
            return false;
        }
    }
    //peek method
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else {
            return top.data;
        }
    }
    //size method
    public int size(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else {
            int count = 1;
            IntLinkedStack.Node temp = top;
            while (temp.next != null) {
                temp = temp.next;
                ++count;
            }
            return count;
        }
    }
    //print stack method
    public void printStack(){
        IntLinkedStack.Node p = top;
        System.out.println("\nUpdated Stack : ");
        while(p.next!=null){
            System.out.println("\n| "+p.data+" |");
            System.out.println("_____");
            p= p.next;
        }
        System.out.println("\n| "+p.data+" |");
    }
    //Node class
    private class Node{
        private int data;
        private Node next;
        //constructor
        private Node(int item, Node next){
            this.data = item;
            this.next = next;
//            System.out.print(this.data+" --> ");
        }
    }

    public static void main(String[] args) {
        IntLinkedStack s = new IntLinkedStack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        System.out.println(s.isEmpty());
        System.out.println(s.size());
//        System.out.println(s.peek());
//        s.printStack();
    }
}
