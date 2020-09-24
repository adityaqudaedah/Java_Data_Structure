package com.data.queue.array_queueu;

import com.data.queue.linked_queue.Queues;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue<E> implements Queues<E> {

   private  E[] data;
   private int front = -1;
   private int rear = -1;
   private static final int SIZE = 5;

   //constructor
    @SuppressWarnings("unchecked")
   ArrayQueue(){
       data = (E[]) new Object[SIZE];
   }
   //show method
    public void show(){
       //to show the queue display
        int i = front;
       while (i!=rear){
           System.out.print(data[i]+" ");
           i= (i+1)% data.length;
       }
        System.out.print(data[i]);
       //to show the array display
        System.out.println("\n"+Arrays.toString(data));

    }
    //resizing method
    @SuppressWarnings("unchecked")
    public void resize(int newSize){
        final E[] newArraySize = (E[]) new Object[newSize];
        int j = front;
        for(int i = 0;i< data.length;++i){
            newArraySize[i] = data[j];
            if (j==rear){
                newArraySize[i] = data[j];
            }
            else {
                j = (j + 1) % data.length;
            }
        }
        data = newArraySize;
        front = 0;
        rear = (data.length/2)-1;

    }
    //overloading method resize
    @SuppressWarnings("unchecked")
    public void resize(){
        final E[] newArraySize = (E[]) new Object[data.length/2];
        int j = front;
        for(int i = 0;i< size();++i){
            newArraySize[i] = data[j];
            if (j==rear){
                newArraySize[i] = data[j];
            }
            else {
                j = (j + 1) % data.length;
            }
        }
        data = newArraySize;
        front = 0;
        rear = (data.length/2)-1;

    }
    @Override
    public void enqueu(E item)  {
        if (front == -1 && rear == -1){
            ++front;
            ++rear;
            data[front] = item;
        }
        else if((rear+1) % data.length == front){
            resize(2*SIZE);
            rear = (rear+1)% data.length;
            data[rear] = item;
        }
        else{
            rear = (rear+1) % data.length;
            data[rear]=item;
        }
    }
    @Override
    public E dequeue() {
        if(isEmpty()) throw new NoSuchElementException();
        else if(size()== data.length/4){
            resize();
            E tempt = data[front];
            data[front] = null;
            front = (front+1) % data.length;
            return tempt;
        }
        E tempt = data[front];
        data[front] = null;
        front = (front+1) % data.length;
       return tempt;
    }
    @Override
    public E peek() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return data[front];
    }
    @Override
    public int size() {
       int count = 0;
       int i = front;
       while (i!=rear){
           ++count;
           i = (i+1)% data.length;
       }
       ++count;
        return count;
    }
    @Override
    public boolean isEmpty() {
        return front == -1;
    }
}