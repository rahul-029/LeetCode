package com.leetcode.LinkedLists;

public class SinglyLinkedList {

    public static void main(String[] args) {

        SinglyLL sll = new SinglyLL();
        sll.insertAtFirst(4);
        sll.insertAtFirst(3);
        sll.insertAtFirst(2);
        sll.insertAtFirst(1);
        sll.insertAtLast(5);
        sll.display();

        sll.insertAtIndex(100, 3);


        sll.display();
        System.out.println(sll.deleteFromFirst());
        sll.display();

    }
}
