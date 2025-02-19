package com.basics.collections.LinkedList;


public class CustomLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList(){
        this.size=0;
    }

    public void insertFirst(int value){

        Node node=new Node(value);
        node.next=head;
        head=node;

        if(tail==null)
            tail=head;
        size+=1;
    }

   private class Node {
        int value;
        Node next;
       public Node(int value){
            this.value=value;
            next=null;
        }
    }

    public static void main(String[] args) {
         int k=10;
        CustomLinkedList l1=new CustomLinkedList();
        l1.insertFirst(k);
        System.out.println("LL Value "+l1.head.value);
        System.out.println("size = "+l1.size);

    }
}
