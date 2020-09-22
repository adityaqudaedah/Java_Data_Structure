package com.data.stack;

import java.util.EmptyStackException;
import java.util.Random;

//Array Stack
class IntArrayStack implements IntStack {
    private int top =  -1;
    private static Object[]data;
    private static final int DEFAULT_CAPACITY = 5;
    //constructor
    public IntArrayStack(){
        data = new Object[DEFAULT_CAPACITY];
    }
    //size method
    @Override
    public int size(){
        int count= 0;
        for(int i = 0;i<data.length;++i){
            if(data[i]==null){
                break;
            }
            ++count;
        }
        return count;

    }
    //push method
    @Override
    public Object push(int item){
        //when stack is full
        if(top == data.length-1) resize(2*data.length);
        data[++top]= item;
        return null;
    }
    //pop method
    public int pop(){
        if(isEmpty(data)) throw new EmptyStackException();
        return (int) data[top--];
    }
    //isEmpty method
    @Override
    public boolean isEmpty(Object[]data){
        boolean empty = true;
            if(data[0]!= null){
                empty = false;
            }

        return empty;
    }
    @Override
    public int peek(){
        int temp = (int)data[top];
        return temp;
    }
    //resize method
    public void resize(int newCapacity){
        Object[]newData = new Object[newCapacity];
        for (int i= 0;i<newData.length;++i){
            newData[i] = data[i];
        }
        data = newData;
    }

    public static void main(String[] args) {
        Random random = new Random();
        IntStack stack = new IntArrayStack();
        for(int i = 0 ; i<data.length;++i){
             stack.push(random.nextInt(100));
        }

//        stack.push(1);
//        stack.push(10);
      System.out.println(stack.size());
//        System.out.println(stack.isEmpty(data));
//        stack.pop();
//        stack.pop();

//        System.out.println(Arrays.toString(data));
//        System.out.println(stack.pop());
    }
}
