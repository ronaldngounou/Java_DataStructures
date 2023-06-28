package com.datastructures;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    //addLast
    public void addLast(int item){
        var node = new Node(item);

        if (head == null){
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

    }

    public void addFirst(int item){
        var node = new Node(item);

        if (head == null){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head = node;
        }
    }

}
