package com.data.queue.array_queueu;

import com.data.queue.linked_queue.Queues;

public class ArrayQueue<E> implements Queues<E> {

   private E[] data;
   private int front = -1;
   private int rear = -1;
   private static final int SIZE = 5;

   ArrayQueue(){
       data = (E[]) new Object[SIZE];
   }

   //show method
    public void show(){
       int i = front;
       while (i!=rear){
           System.out.println(data[i]);
           i= (i+1)% data.length;
       }
        System.out.println(data[i]);
    }

    @Override
    public void enqueu(E item) throws Exception {
        if (front == -1 && rear == -1){
            ++front;
            ++rear;
            data[front] = item;
        }
        else if((rear+1) % data.length == front){
            throw new Exception("Stack has been full");
        }
        else{
            rear = (rear+1) % data.length;
            data[rear]=item;
        }
    }

    @Override
    public E dequeue() {
        E tempt = data[front];
        front = (front+1) % data.length;
       return tempt;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
