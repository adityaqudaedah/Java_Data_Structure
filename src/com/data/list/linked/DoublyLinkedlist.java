package com.data.list.linked;

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


        if (index < 0 || index > size-1) {
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
            System.out.println(head.data);
            head = head.prev;
        }
        System.out.println(head.data);
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

    //delete at index method
    public E deleteAt(int index) {

        Node curr = (Node) getNode(index);
        E result = (E) curr.data;

        if (index < 0 || index > size-1) {
            throw new ArrayIndexOutOfBoundsException("you attempted to delete at " +
                    index +
                    " indexes");
        }else if(index == 0) {
            return deleteAtHead();
        }else{
            //changes the next pointer of previous nodes to the next nodes of current node
            curr.prev.next = curr.next;
            //if next node of the current are not null,
            //the previous pointer will pointed at the previous pointer of current
            if (curr.next != null) curr.next.prev = curr.prev;
            size--;
        }
        return result;
    }

    //delete at head mehtod
    public E deleteAtHead(){

        Node curr = head;
        curr.next.prev = curr.prev;

        return (E) curr.data;
    }

    //get node method
    private E getNode(int index) {

        Node curr = head;

        for (int i = 0; i < index ; ++i) {
            curr = curr.next;
        }
        return (E) curr;
    }

    //main function
    public static void main(String[] args) {
        DoublyLinkedlist list = new DoublyLinkedlist();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.deleteAt(2));

//        list.anotherReverse();
//        list.addAtFront(0);
//        list.add(4);
//        list.addAt(1,10);
//        list.addAt(2,9);

//        System.out.println("\n"+list.size);


    }

}
