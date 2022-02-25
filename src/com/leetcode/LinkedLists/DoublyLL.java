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

    public void display(){

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " --> " );
            temp = temp.next;
        }
        System.out.println("END");
    }
}
