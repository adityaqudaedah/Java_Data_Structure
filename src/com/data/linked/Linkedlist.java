package com.data.linked;

//Linked list
class Linkedlist{
     static Node head;
    static class Node{
        int data;
        Node next;
        //constructor
        Node (int item, Node next){
            this.data = item;
            this.next = next;
        }
        //second constructor
        Node(int item){
            this(item,null);
        }
    }
    //Insert method
    public void insert(int item){
        Node n = head;
        Node node = new Node(item);
        //if node is null or empty
        if(head==null){
            head = node;
        }
        else{
            while (n.next != null) {
                n= n.next;
            }
            n.next = node;
        }
    }
    //Insert at the start method
    public void insertAtTheStart(int item){
        Node node = new Node(item);
        node.next = head;
        head = node;
    }
    //Insert at index method
    public void insertAt(int index,int item) {
        Node node = new Node(item);
        Node temp = head;
        //if index = 0
        if (index == 0) insertAtTheStart(item);
        else {
            for (int i = 0; i < index - 1; ++i) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }
    //Delete by index method
    public void deleteAt(int index){
        Node temp1 = null;
        if(index==0) {
            //print out the result
            System.out.println("item "+head.data+" has been removed from list");

            head = head.next;
        }
        else{
            Node temp = head;
            for(int i = 0;i<index-1;++i){
                temp = temp.next;
            }
            temp1= temp.next;
            temp.next = temp1.next;

            //print out the result
            System.out.println("item "+temp1.data+" has been removed from list");
        }
    }

    //Show method
    public void show(){
        Node temp = head;
        while (temp.next!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);

    }
    //Show1 method
    public static void show(Node list){
        Node p = list;
        while(p.next!=null){
            System.out.println(p.data);
            p = p.next;
        }
        System.out.println(p.data);
    }
    //main method
    public static void main(String[] args) {
//        Linkedlist list = new Linkedlist();

        //using second constructor
        Node head = new Node(2,null);
        head  = new Node(4,head);
        head = new Node(6, head);
        show(head);

//        list.insert(3);
//        list.insert(5);
//        list.insert(7);
//        list.insert(9);
//        list.insertAtTheStart(1);
//        list.insertAt(4,8);
//        list.deleteAt(5);
//        System.out.println("list updated : ");
//        list.show();
    }
}
