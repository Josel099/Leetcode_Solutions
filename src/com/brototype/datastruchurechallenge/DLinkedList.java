package com.brototype.datastruchurechallenge;

public class DLinkedList {

    Node head = null;
    Node tail = null;
    public class Node{

        int  data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }

    }
    void addNode(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else {
            tail.next=newNode;
            newNode.prev = tail;
        }
        tail=newNode;
    }

 // INSERT AFTER OPERATION
     void insertAfter(int nextTo , int data) {

         Node temp = head;
         if (temp == null) { // checking the head is null . if it's true - > calling addNode func .
             addNode(data);
             return;
         }


         while (temp != null && temp.data != nextTo) {
             temp = temp.next;
         }
         if(temp == null){
             System.out.println("the element is not present in the LinkedList");
             return;
         }
         if (temp == tail) {
            addNode(data);
            return;
         }
         Node newNode = new Node(data); // node creating

         newNode.next = temp.next;
         newNode.prev = temp;
         Node after = temp.next;
         after.prev = newNode;
         temp.next = newNode;


     }

    // INSERT BEORE OPERATION
    void insertBefore(int beforeTo ,int data ){

        Node temp = head;
        if (temp == null) { // checking the list is null or not . if it's true - > calling addNode func .
            addNode(data);
            return;
        }

        Node newNode = new Node(data); // node creating

        if(temp.data == beforeTo){ // checking the head node data is equal to the beforeTo data
            temp.prev =newNode;
            newNode.next = temp;
            head = newNode;
            return;
        }
        while (temp != null && temp.data != beforeTo) {
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("the element is not present in the LinkedList");
            return;
        }
        newNode.next = temp;
        newNode.prev = temp.prev;
        Node before = temp.prev;
        before.next = newNode;
        temp.prev = newNode;
    }




   // DELETE OPERATION
    void delete( int data){
       Node temp = head;
        // deleting head node
        if(temp != null && temp.data == data){
            head = head.next;
            head.prev = null;
            return;
        }
        //deleting in between two nodes
        while(temp != null && temp.data != data){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("the element is not present in the dLinkedList");
        }
        //deleting in tail
        if(temp==tail) {
            Node previous = temp.prev;
            previous.next=null;
            return;
        }
        //deleting in between two nodes
        Node previous = temp.prev;
        previous.next = temp.next;// storing the next node in  previous node next field
        Node after = temp.next;
        after.prev = temp.prev;
    }


    void display(){

        if (head ==null){
            System.out.println("empty Linked List");
        }else{
            Node temp=head;
            while(temp != null){

                System.out.println(temp.data);
                temp = temp.next;

            }
        }
    }

    void displayReverse(){

        if (head ==null){
            System.out.println("empty Linked List");
        }else{
            Node temp=tail;
            while(temp != null){

                System.out.println(temp.data);
                temp = temp.prev;

            }
        }
    }
    // main class
    public static void main(String[] args){

        DLinkedList newLinkedlist= new DLinkedList();
        newLinkedlist.addNode(19);
        newLinkedlist.addNode(10);
        newLinkedlist.addNode(1);
        newLinkedlist.addNode(4);
        newLinkedlist.addNode(2);

        newLinkedlist.display();
        System.out.println(" \t");
        //newLinkedlist.displayReverse();
        newLinkedlist.insertBefore(4,5);
        newLinkedlist.display();

//          newLinkedlist.delete(2);
//          newLinkedlist.delete(4);
//          newLinkedlist.delete(19);
//          newLinkedlist.display();
    }
}
