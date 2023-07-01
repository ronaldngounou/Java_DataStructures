package com.datastructures;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    // Fields
    private Node head;
    private Node tail;
    private int size;

    public void addLast(int item){
        var node = new Node(item);

        if (head == null){
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        size++;

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
        size++;
    }

    public int indexOf(int item){
        int index = 0;
        var current = head;
        while(current!=null){
            if (current.value == item)
                return index;
            else{
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    public boolean contains(int item){
        var current = head;
        while(current!=null){
            if (current.value == item)
                return true;
            current = current.next;
        }
        return false;
    }

    public void removeFisrt(){
        //[10 -> 20 -> 30]
        if (head == null)
            throw new NoSuchElementException();

        if (head == tail){
            head = tail = null;
            return;
        }
        var second = head.next; //create a second variable to point to the second node
        head.next = null; //set the node after the head to be null
        head = second;

        size --;
    }

    public void removeLast(){
        // [10 -> 20 -> 30]
        if (head==null)
            throw new NoSuchElementException();

        if (head==tail){
            head = null;
            tail = null;
        }else{
            var previous = getPrevious(tail);
            tail = previous;
            tail.next = null;
        }
        size--;

    }

    private Node getPrevious(Node node){
        var current = head;
        while (current != null){
            if (current.next == tail) break;
            current = current.next;
        }
        return null;
    }

    private int count =1 ;
    public int size(){
        var current = head;

        while (current.next != null){
            count ++;
            current = current.next;
        }
        return count;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = head;
        var index = 0;
        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    public void reverse(){
        // [10 -> 20 -> 30]
        //  p     c     n
        //  backup = c.next
        //  c.next = p

        var previous = head;
        var c = head.next;
        var n = c.next;
        previous = c.next;

        while(c !=null){
            var next = current.next;

        }
    }

}
