package com.data.generic_stack.arraystack;

import java.util.EmptyStackException;
import java.util.Objects;

class ArrayStack<E> implements Stacks<E> {
    private E[] data;
    int top = -1;
    private static final int SIZE = 5;

    //constructor
    @SuppressWarnings("unchecked")
    ArrayStack() {
        data = (E[]) new Object[SIZE];
    }

    //push method
    @Override
    public void push(E item) {
        if (top == data.length - 1) {
            resize(2 * SIZE);
            data[++top] = item;
        } else if (data[++top] == null) {
            data[top] = item;
        }
    }

    //pop method
    @Override
    public E pop() {

        if (size() <= data.length / 4) {
            resize();
            E temp = data[top];
            data[top] = null;
            top--;
            return temp;
        }
        if (isEmpty()) {
            return data[top];
        } else {
            E tempt = data[top];
            data[top] = null;
            top--;
            return tempt;
        }
    }

    //peek method
    @Override
    public E peek() {
        return data[top];
    }

    //is empty method
    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    //size method
    @Override
    public int size() {

        int count = 0;
        if (top == -1) {
            return count;
        }
        for (E temp : data) {
            if (isEmpty() || temp == null) break;
            ++count;
        }
        return count;
    }

    //resize method
    private void resize(int newSize) {
        @SuppressWarnings("unchecked")
        E[] newArray = (E[]) new Object[newSize];
        for (int i = 0; i < data.length; ++i) {
            newArray[i] = data[i];
        }
        this.data = newArray;
    }

    //Overloading method resize for reduce
    private void resize() {
        int reduceSize = data.length / 2;
        E[] newArraySize = (E[]) new Object[reduceSize];
        for (int i = 0; i < reduceSize; ++i) {
            newArraySize[i] = data[i];
            if (data[i] == null) {
                data = newArraySize;
                break;
            }
        }
    }

    //print method
    public void printStack() {
        for (E p : data) {
            System.out.print(p + ", ");
        }
        System.out.println("\n");
    }

    /*
    * bellow here on the main method you can also use as Array stack implementation
     */

/*
//Main method
public static void main(String[] args) {
        ArrayStack <Integer> s = new ArrayStack<>();

       // auto boxed
        for(int i=0;i<SIZE;++i){
            s.push(i);
        }
        s.push(5);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();

        s.printStack();
    }*/
}
