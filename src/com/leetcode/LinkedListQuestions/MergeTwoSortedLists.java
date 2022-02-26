package com.leetcode.LinkedListQuestions;

import com.sun.org.apache.xerces.internal.xni.parser.XMLErrorHandler;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        SinglyLL first = new SinglyLL();
        first.insertAtLast(1);
        first.insertAtLast(3);
        first.insertAtLast(5);

        SinglyLL second = new SinglyLL();
        second.insertAtLast(1);
        second.insertAtLast(2);
        second.insertAtLast(9);
        second.insertAtLast(14);

        SinglyLL finalList = new SinglyLL();
        finalList = finalList.merge(first, second);
        finalList.display();

    }
}
