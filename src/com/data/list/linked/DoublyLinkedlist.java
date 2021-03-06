package com.data.list.linked;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoublyLinkedlist<E> {

    static Node head;
    int size;

    //Node class
    private static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        //constructor
        Node(E data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    //show Linked list
    public void show() {
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + ", ");
            current = current.next;
        }
        System.out.print(current.data);
    }

    public boolean isEmpty() {
        return head == null;
    }

    //overloading show method
    public void show(Node head) {

        while (head.next != null) {
            System.out.print(head.data + ", ");
            head = head.next;
        }
        System.out.print(head.data);
    }

    //insert at the rear method
    public void add(E data) {

        Node current = head;
        Node node = new Node(data);
        if (current == null) {
            head = new Node<>(data);
            ++size;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            ++size;
            node.prev = current;
        }
    }

    //insert at the head
    public void addAtFront(E data) {
        Node currHead = head;
        Node newHead = new Node(data);
        currHead.prev = newHead;
        newHead.next = currHead;
        head = newHead;
        ++size;
    }

    //insert at index
    public void addAt(int index, E data) {

        Node curr = head;
        Node node = new Node(data);


        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (index == 0) {
            addAtFront(data);
            ++size;
        } else {
            for (int i = 0; i < index - 1; ++i) {
                curr = curr.next;
            }
            node.next = curr.next;
            curr.next.prev = node;
            curr.next = node;
            node.prev = curr;
            ++size;
        }
    }

    //reverse method
    public void reverse() {

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }
        head = curr;
        while (head.prev != null) {
            System.out.print(head.data +", ");
            head = head.prev;
        }
        System.out.print(head.data);
    }

    //another reverse method
    public void anotherReverse() {

        Node curr = head;
        Node temp = null;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        temp = temp.prev;

        show(temp);

    }

    //delete or remove at index method
    public E removeAt(int index) {
        Node curr = (Node) getNode(index);
        Node prev = (Node) getNode(index - 1);
        Node next = (Node) getNode(index + 1);
        E result = (E) curr.data;

        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("you attempted to delete at " +
                    index +
                    " indexes");
        } else if (index == 0) {
            return deleteAtHead();
        }else {
            prev.next = curr.next;

            if (next!= null) next.prev = prev;
            --size;
        }
        return result;
    }

    //delete at index method
    public E deleteAt(int index) {

        Node curr = (Node) getNode(index);
        E result = (E) curr.data;


        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("you attempted to delete at " +
                    index +
                    " indexes");
        } else if (index == 0) {
            return deleteAtHead();
        } else {
            //changes the next pointer of previous nodes to the next nodes of current node
            curr.prev.next = curr.next;
            //if next node of the current are not null,
            //the previous pointer will pointed at the previous pointer of current
            if (curr.next != null) curr.next.prev = curr.prev;
            size--;
        }
        return result;
    }

    //delete at head method
    public E deleteAtHead() {

        Node curr = head;
        curr.next.prev = curr.prev;

        return (E) curr.data;
    }

    //get node method
    private E getNode(int index) {

        Node curr = head;

        for (int i = 0; i < index; ++i) {
            curr = curr.next;
        }
        return (E) curr;
    }

    //iterator method
    public Iterator iterator(){
        return new listIterator();
    }

    private class listIterator implements Iterator<E>{
        private Node current;

        //constructor
        listIterator(){
            this. current = head;
        }
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext())throw new NoSuchElementException();
            E result = (E) current.data;
            current = current.next;
            return result;
        }
    }


    //main function
    public static void main(String[] args) {
       DoublyLinkedlist list = new DoublyLinkedlist();

       list.add(1);
       list.add(2);
       list.add(3);

       Iterator i = list.iterator();

       //print list using iterator
        while (i.hasNext()) {
            System.out.println(i.next());
        }

//        list.addAtFront(0);
//        list.add(4);
//        list.addAt(1,10);
//        list.addAt(2,9);
//
//        list.deleteAt(1);
//        list.removeAt(1);
//
//        list.show();
//        System.out.println();
//        list.reverse();
//        System.out.println();
//        list.anotherReverse();
//
//        System.out.println("\n"+list.size);

    }

}
