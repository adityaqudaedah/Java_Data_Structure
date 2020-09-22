package com.data.generic_stack.arraystack;

public interface Stacks<E> {
    void push(E item);
    E pop();
    E peek();
    boolean isEmpty();
    int size();
}
