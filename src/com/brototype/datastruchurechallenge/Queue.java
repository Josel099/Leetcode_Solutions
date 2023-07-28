package com.brototype.datastruchurechallenge;

public class Queue {
public Node front;
public Node rear;
    class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
        }

    }
    void enQueue(int data){
        Node newNode = new Node(data);

        if(rear==null){
            front = rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
    }
void deQueue(){
        if(front == null) {
            System.out.println("Underflow");
            return;
        }
    front =front.next;
    if(front==null) rear=null;
}

void display(){
      Node  current = front;
      if(current == null ) {
         System.out.println("The Queue is Empty !");
         return;
      }
      while(current != null){
          System.out.print(current.data + " ");
          current= current.next;
      }

}
    public static void main(String[] args) {
//
        Queue queue = new Queue();
        queue.enQueue(5);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(1);
        queue.enQueue(7);
        queue.display();
        System.out.println(" \t");
        queue.display();

    }
}
