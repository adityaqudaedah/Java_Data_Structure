package com.data.list;

public interface List <E> {
    void add (E item);
    void add (int index, E item);
    E get(int index);
    int indexOf(E item);
    boolean isEmpty();
    E removeAt(int index);
    void set(int index, E item);
    int size();
}
