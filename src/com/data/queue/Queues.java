package com.data.queue;

public interface Queues<E> {
    public void enqueu(E item);
    public E dequeue();
    public E peek();
    public int size();
    public boolean isEmpty();
}
