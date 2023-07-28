package com.brototype.datastruchurechallenge;

public class LinkedList {

     // intially the linked list head and tail is empty
     Node head = null;
     Node tail = null;


     public class Node{            //node class .
          int data;
          Node next;
          Node(int data){
               this.data=data;
          }
     }

     //linked list operations
     void addNode(int data){

          Node newNode = new Node(data);
          if(head == null){
               head = newNode;
          }else {
               tail.next=newNode;
          }
          tail=newNode;
     }

     void delete(int data){
          Node temp = head,prev = null;
          //deleting  head
          if(temp != null &&  data == temp.data){
               head=head.next;
               return ;
          }
        //  deleting in between two nodes
           while(temp != null && temp.data != data){
                prev = temp;
                temp= temp.next;
           }
          if(temp == null){
               System.out.println("the element is not present in the LinkedList");
          }
          //deleting in tail
          if(temp == tail){
          tail=prev;
          tail.next=null;
          return;
          }
          prev.next=temp.next; //  deleting in between two nodes
     }
// insert an node
     void insertAfter(int nextTo,int data){
          Node newNode = new Node(data);

          Node temp = head;

          if(temp == null){
               addNode(data);
               return;
          }
          while(temp != null && temp.data != nextTo){
               temp=temp.next;
          }
          if(temp == null){
               System.out.println("the element is not present in the LinkedList");
               return;
          }
          if (temp == tail){
               temp.next=newNode;
               tail = newNode;
               return;
          }


          newNode.next = temp.next;
          temp.next = newNode;
     }
//   REVERSE THE SINGLYLINKEDLIST :::!!!!
     void reverse(){
        Node  temp = head;
        // pending

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

     public static void main(String[] args){

          LinkedList newLinkedlist= new LinkedList();
          newLinkedlist.addNode(19);
          newLinkedlist.addNode(10);
          newLinkedlist.addNode(1);
          newLinkedlist.addNode(4);
          newLinkedlist.addNode(2);

            newLinkedlist.display();
            System.out.println(" \t");
            newLinkedlist.insertAfter(2,3);
          newLinkedlist.display();

//          newLinkedlist.delete(2);
//          newLinkedlist.delete(4);
//          newLinkedlist.delete(19);
//          newLinkedlist.display();
     }


}
