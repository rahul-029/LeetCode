package com.leetcode.LinkedLists;

public class CircularLL {

    private Node head;
    private Node tail;

    private class Node{

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value){

        Node node = new Node(value);
        if(head == null){
            head= node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){

        Node temp = head;
        do{
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("HEAD");
    }
}
