package com.brototype.datastruchurechallenge;

public class Stack {
    Node top = null;
    class Node{
        int  data ;
        Node next;
        Node(int data ){
            this.data = data;
        }
    //Stack definition


  }

// PUSH OPERATION
    void  push(int data){
      Node newNode = new Node(data);
      if(top == null){
          top = newNode;
          top.next=null;
      }else{
          newNode.next=top;
          top = newNode;
      }
    }

    void pop(){
        if(top == null){
            System.out.println("stack under flow ");
            return;
        }
        top=top.next;
    }







    void display(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }
            Node current=top;
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;

        }
    }


    public static void main(String[] args) {
   Stack stack = new Stack();
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        stack.display();
        stack.pop();
        System.out.println(" \t\t\t");
        stack.display();

    }
}
