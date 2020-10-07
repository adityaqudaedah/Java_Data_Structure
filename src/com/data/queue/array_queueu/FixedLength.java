package com.data.queue.array_queueu;

public class FixedLength <E> extends ArrayQueue<E>{
    private int drops;
    private static int capacity =5;

    //constructor
    FixedLength(int size){
        super(size);
    }
    @Override
    public void enqueu(E item){
        if (super.size()== capacity ){
            drops++;
        }
        else{
            super.enqueu(item);
        }
    }
    //drops method
    public int drops(){
        return drops;
    }
    //display method
    public void display(){
        super.show();
    }

}
