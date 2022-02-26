package com.leetcode.LinkedListQuestions;

public class SinglyLL {

    private Node head;
    private Node tail;

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insertAtLast(int value){

        if(head == null){
            Node node = new Node(value);
            head = node;
            tail = node;
            tail.next = null;
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;

    }

    // Questions
    public void removeDuplicates(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
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
