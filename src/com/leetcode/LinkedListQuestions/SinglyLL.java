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

    // Don't use this...system may give GC overhead/OutOfMemory :)
    public void createCycle(){
        Node temp = tail;
        Node node = getNode(2);

        tail.next = node;
    }

    private Node getNode(int index) {

        Node temp = head;
        for(int i=0; i < index; i++){
            temp = temp.next;
        }

        return temp;
    }

    // Questions -- remove duplicates from LL
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

    // Detect cycle/loop in linkedList
    public boolean hasCycle(){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }

        return false;
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
