package com.data.stack;

//Interface of Stack
interface IntStack{
    boolean isEmpty(Object[] data);
    int peek();
    int  pop();
    Object push(int item);
    int size();
}
