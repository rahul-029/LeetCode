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

    // Question -- merge two sorted lists
    public SinglyLL merge(SinglyLL firstList, SinglyLL secondList){

        //  firstList:  1 --> 3 --> 5
        //  secondList: 1 --> 2 --> 9 --> 14

        Node first = firstList.head;
        Node second = secondList.head;

        SinglyLL newList = new SinglyLL();
        while(first.next != null && second.next != null){

            if(first.value < second.value){
                newList.insertAtLast(first.value);
                first = first.next;
            } else {
                newList.insertAtLast(second.value);
                second = second.next;
            }
        }

        while(first != null){
            newList.insertAtLast(first.value);
            first = first.next;
        }

        while (second != null){
            newList.insertAtLast(second.value);
            second = second.next;
        }

        return newList;


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
