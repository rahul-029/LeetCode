package com.leetcode.LinkedLists;

public class DoublyLL {

    Node head;
    private class Node {

        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insertAtFirst(int value){

        if(head == null){
            Node node = new Node(value);
            head = node;
            head.prev = null;
            return;
        }


        Node node = new Node(value);
        head.prev = node;
        node.next = head;
        head = node;
    }

    public void insertAtLast(int value){

        if(head == null){
            insertAtFirst(value);
            return;
        }

        Node last = head;
        Node node = new Node(value);

        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        node.next = null;

    }

    public void display(){

        Node temp = head;
        Node last = null;
        while(temp != null) {
            last = temp;
            System.out.print(temp.value + " --> " );
            temp = temp.next;
        }
        System.out.println("END");

        //Print in reverse
        while(last != null){
            System.out.print(last.value + " --> ");
            last = last.prev;
        }
        System.out.println("START");
    }
}
