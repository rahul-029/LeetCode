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

    // Find the length of the cycle in linkedlist
    public int findCycleLength(){

        Node fast = head;
        Node slow = head;
        int length = 0;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                Node temp = slow;
                do{
                    temp = temp.next;
                    length++;
                } while(temp != slow);
            }
        }

        return length;
    }

    // Find the starting point of the loop
    public int findStartOfLoop(){

        Node fast = head;
        Node slow = head;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }

        if(slow != fast){
            return -1;
        }
        slow = head;

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow.value;
    }

    // Find middle of linkedList
    public Node findMiddleNode(){

        Node fast = head;
        Node slow = head;

        while(fast != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    // find whether a number is a Happy number.
    public boolean isHappy(int num){

        int slow = num;
        int fast = num;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if(slow == 1){
            return true;
        }

        return false;
    }

    private int findSquare(int n){

        int digit = 0;
        int square = 0;
        while(n > 0){
            digit = n % 10;
            square += digit * digit;
            n = n/10;
        }

        return square;
    }

    // reverse a linked list
    public void reverseList(){

        if(head == null){
            return;
        }

       Node prev = null;
       Node present = head;
       Node next = present.next;

       while(present != null){

           present.next = prev;
           prev = present;
           present = next;
           if(next != null){
               next = next.next;
           }
       }

       head = prev;

    }


    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }

        System.out.println("END");
    }


    public static void main(String[] args) {
        SinglyLL sll = new SinglyLL();
        /*sll.insertAtLast(1);
        sll.insertAtLast(1);
        sll.insertAtLast(1);
        sll.insertAtLast(2);
        sll.insertAtLast(4);
        sll.insertAtLast(4);*/

        sll.insertAtLast(5);
        sll.insertAtLast(4);
        sll.insertAtLast(3);
        sll.insertAtLast(2);
        sll.insertAtLast(1);


        //sll.display();
        //sll.removeDuplicates();
        //sll.reverseList();
       // sll.display();

        sll.createCycle();
        int i = sll.findStartOfLoop();
        System.out.println("Loop starting at: " +i);

        /*Node middleNode = sll.findMiddleNode();
        System.out.println("Middle node is: " +middleNode.value);

        System.out.println(sll.isHappy(19));*/
    }
}
