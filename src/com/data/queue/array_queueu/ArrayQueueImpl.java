package com.data.queue.array_queueu;

public class ArrayQueueImpl {
    public static void main(String[] args) {
       int size = 5;
        FixedLength<Integer> q = new FixedLength<>(size);
        q.enqueu(1);
        q.enqueu(3);
        q.enqueu(5);
        q.enqueu(7);
        q.enqueu(9);
        q.enqueu(11);
        q.enqueu(13);
        System.out.println(q.drops());
       /* ArrayQueue<Integer> q = new ArrayQueue<>(size);
        q.enqueu(3);
        q.enqueu(5);
        q.enqueu(7);
        q.enqueu(9);
        q.enqueu(11);
        q.enqueu(13);
        q.enqueu(15);
        q.enqueu(17);
        q.enqueu(19);
        q.enqueu(21);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
//        System.out.println(q.isEmpty());
//        System.out.println(q.peek());
        q.show();*/

    }
}
