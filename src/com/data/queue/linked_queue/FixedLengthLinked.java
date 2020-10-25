package com.data.queue.linked_queue;

public class FixedLengthLinked<E> extends LinkedQueue<E> {

    private int drops;
    protected static int capacity = 5;
    private int size = 0;

    @Override
    public void enqueu (E item){

        if(size !=capacity){
            super.enqueu(item);
            this.size++;
        }
        else {
            ++drops;
        }
    }
    //drops method
    public int drops(){
        return drops;
    }
    @Override
    public void show(){
        super.show();
    }
}
