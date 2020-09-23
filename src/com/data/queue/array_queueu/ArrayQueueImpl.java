package com.data.queue.array_queueu;

public class ArrayQueueImpl {
    public static void main(String[] args) throws Exception {
        ArrayQueue<Integer> q = new ArrayQueue<>();
        q.enqueu(3);
        q.enqueu(5);
        q.enqueu(7);
        q.enqueu(9);
        q.enqueu(11);
        q.dequeue();
        q.enqueu(13);
        q.show();
    }
}
