package com.leetcode.LinkedLists;

public class SinglyLL {

    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    // Insert Operations
    public void insertAtFirst(int value){

        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = head;
        } else {
            node.next = head;
            head = node;
        }

        size++;
    }

    public void insertAtLast(int value){

        Node node = new Node(value);

        if(head == null){    // if head is null --> list is empty
            insertAtFirst(value);
            return;
        }
        tail.next = node;
        tail = node;

        size++;
    }

    public void insertAtIndex(int value, int index){

        if(index == 0){
            insertAtFirst(value);
            return;
        }

        if(index == size){
            insertAtLast(value);
            return;
        }

        Node temp = head;
        for(int i=1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;

        size++;
    }


    // Delete Operations

    public int deleteFromFirst(){

        if(head == null){
            System.out.println("List is empty");
            return -1;
        }
        int value = head.value;
        Node temp = head;
        head = temp.next;

        size--;

        return value;

    }

    public int deleteFromLast(){
        if(head == null){
            System.out.println("List is empty");
            return -1;
        }

        int value = tail.value;
        Node secondLast = getNode(size-2);
        tail = secondLast;
        tail.next = null;

        size--;
        return value;

    }


    public int deleteAtIndex(int index){
        if(index == 0){
            deleteFromFirst();
        }

        if(index == size){
            deleteFromLast();
        }

        Node previousNode = getNode(index-1);
        int value = previousNode.next.value;
        previousNode.next = previousNode.next.next;

        size--;
        return value;

    }

    public Node getNode(int index){
        Node temp = head;
        for(int i=0; i < index; i++){
            temp = temp.next;
        }

        return temp;
    }

    public void display(){

        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
