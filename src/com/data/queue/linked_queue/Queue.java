package com.data.queue.linked_queue;

public interface Queue<E> {
     void enqueu(E item) throws Exception;
     E dequeue();
     E peek();
     int size();
     boolean isEmpty();
}
