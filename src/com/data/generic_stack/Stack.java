package com.data.generic_stack;

import java.util.EmptyStackException;

public class Stack<E> {
    private Node<E> top;

    //push method
    public void push(E item){
        top = new Node<>(item,top);
    }
    //pop method
    public E pop (){
        if (top==null){
            throw new EmptyStackException();
        }
        else{
            E temp = top.getData();
            top = top.getNext();
            return temp;
        }
    }
    //is empty method
    public Boolean isEmpty(){
        if (top==null){
            return true;
        }
        return false;
    }
    //peek method
    public E peek(){
        return top.getData();
    }
    //print stack
    public void printStack(){
        Node<E> n = top;
        while(n.getNext()!=null){
            System.out.println("| "+n.getData()+" |");
            System.out.println("_________");
            n = n.getNext();
        }
        System.out.println("| "+n.getData()+" |");
    }

    //size method
    public int size(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else{
            Node<E> temp = top;
            int count = 0;
            while(temp!=null){
                temp = temp.getNext();
                ++count;
            }
            return count;
        }
    }

    //Main method
    public static void main(String[] args) {
        Stack <String> stack = new Stack<>();

        //Operate your stack here...
        stack.push("This ");
        stack.push("Is   ");
        stack.push("Stack");
        stack.pop();
        //get head info of stack
        System.out.println(stack.peek());
        //is stack is empty?
        System.out.println(stack.isEmpty());
        //size of your stack
        System.out.println(stack.size());
        //print the entire stack
        stack.printStack();

    }
}
