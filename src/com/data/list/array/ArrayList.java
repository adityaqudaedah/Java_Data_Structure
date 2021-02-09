package com.data.list.array;

import java.util.Arrays;

public class ArrayList<E> implements List<E> {

    private final int DEFAULT_CAPACITY = 10;

    private final Object[] EMPTY_ELEMENT_DATA = {};

    private final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    private Object[] elementData;

    private int size;

    private int pointer = -1;

    /**
     * Constructor for array/list  with initial capacity
     */
    public ArrayList(int initCapacity) {
        if (initCapacity > 0) {
            this.size = initCapacity;
            this.elementData = new Object[initCapacity];
        } else if (initCapacity == 0) {
            this.size = initCapacity;
            this.elementData = EMPTY_ELEMENT_DATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity " + initCapacity);
        }
    }

    /**
     * Constructor for an empty array/list
     */
    public ArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    public String toString(){
        return Arrays.toString(elementData);
    }

    @Override
    public void add(E item) {
        if (size==0) {
            this.elementData = new Object[++size];
        }
        else {
            ++size;
            this.elementData = Arrays.copyOf(elementData, elementData.length + 1);
        }
        this.elementData[++pointer] = item;

    }
    @Override
    public void add(int index, E item) {
        if (size==0||index >= elementData.length||index<0){
            throw new ArrayIndexOutOfBoundsException("Index = "+index +"  size = "+size);
        }
        else{
            ++size;
            this.elementData = Arrays.copyOf(elementData,elementData.length+1);
            for (int i = elementData.length-1;i>index;--i){
                this.elementData[i] = this.elementData[i-1];

            }
            this.elementData[index] = item;
        }
    }

    @Override
    public E get(int index) {
        return (E)elementData[index];
    }

    @Override
    public int indexOf(E item) {
        int index=0;
        while(!elementData[index].equals(item)){
            ++index;
        }
        return index;
    }

    @Override
    public boolean isEmpty() {
        if(elementData.length==0) {
            return true;
        }
        return false;
    }

    @Override
    public E removeAt(int index) {
        Object temp = elementData[index];
        for(int i = index;i< elementData.length-1;++i){
            elementData[i]=elementData[i+1];
        }
        --size;
        this.elementData = Arrays.copyOf(elementData,elementData.length-1);
        return (E)temp;
    }

    @Override
    public void set(int index, E item) {
        elementData[index] = item;
    }

    @Override
    public int size() {
        return size;
    }

}

