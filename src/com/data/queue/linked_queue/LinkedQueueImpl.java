package com.data.queue.linked_queue;

public class LinkedQueueImpl {
    public static void main(String[] args) {
//        LinkedQueue<Integer> q = new LinkedQueue<>();
//        q.enqueu(3);
//        q.enqueu(5);
//        q.enqueu(7);
//        q.enqueu(9);
//        q.enqueu(11);
//        q.dequeue();

//        q.show();
//        System.out.println("");
//        System.out.println(q.peek());
//        System.out.println(q.size());
//************************************************
        FixedLengthLinked<Integer>queue = new FixedLengthLinked<>();

        for(int i =0;i<FixedLengthLinked.capacity;++i){
            queue.enqueu(i);
        }
        queue.enqueu(5);
        queue.show();
        System.out.println("\n"+queue.drops());

    }
}
