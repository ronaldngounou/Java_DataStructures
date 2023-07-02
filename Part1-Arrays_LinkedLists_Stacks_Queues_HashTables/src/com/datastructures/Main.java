package com.datastructures;

import java.util.*;
import java.util.Stack;

public class Main {
    public static void main( String[] args){

        /*int [] numbers = new int[3];
        numbers[0] = 10;
        int [] num = {3, 4, 7};

        System.out.println(Arrays.toString(numbers));
        System.out.println(num.length);*/
        // Linked Lists
        /*Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(20);

        //System.out.println(numbers.indexOf(44));

        Array others = new Array(3);
        others.insert(10);
        others.insert(20);
        others.insert(30);

        Array common = new Array(3);
        common = numbers.intersect(others);
        common.print();

        //System.out.println("others");
        others.print();
        //System.out.println("others reversed");
        others.reverse();
        others.print();


        // LinkedList
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);

//        System.out.println(list.indexOf(30));
//        System.out.println(list.contains(55));
//        System.out.println(list.size());
//        list.removeFisrt();
//        System.out.println(list.size());
        //list.reverse();
        System.out.println("middle of the list:");
        list.printMiddle();
        var array = list.toArray();
        System.out.println(Arrays.toString(array));

        // Find the Kth node from the end of linked list in one pass.
        // [10 -> 20 -> 30 -> 40 -> 50]
        //               *           *
        // K = 1 (50)
        // K = 2 (40)
        // K = 3 (30)  (distance = 2) = k-1
        System.out.println(list.getKthFromTheEnd(2));

        System.out.println(list.hasLoop());*/

        // Stacks
        /*Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        var top = stack.pop(); //removes the item on the top
        System.out.println(stack);
        top = stack.peek();
        System.out.println(top);*/

        // Write a code to reverse this string. Stacks are useful when I have to do something in reverse or going back.


        // StringReverser reverser = new StringReverser();
        /*var result = reverser.reverse(null);
        System.out.println(result);*/

        // Check if an expression is balanced.
        /*String str = "(1+3]";
         Edge cases
         (
         (()
         ) (
        Expression expression = new Expression();
        System.out.println((expression.isBalanced(str)));*/

        /*Stack stack = new Stack();
        stack.push(5);
        stack.push(45);
        stack.push(35);
        stack.push(55);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);*/

        // TwoStacks

        /*TwoStacks twostacks = new TwoStacks(9);
        twostacks.push1(1);
        twostacks.push1(2);
        twostacks.push1(3);
        twostacks.push2(7);
        twostacks.push2(8);
        twostacks.push2(9);


        //System.out.println(twostacks.pop1());
        System.out.println(twostacks.pop2());
        System.out.println(twostacks.pop2());
        System.out.println(twostacks.isEmpty2());
        System.out.println(twostacks);*/

        // MinStack

        /*MinStack minstack = new MinStack();
        minstack.push(3);
        minstack.push(6);
        minstack.push(9);

        System.out.println(minstack);*/

        // Intro queues
        /* Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30); */
        // Reversing a queue - Popular interview question.

        /*Queues.reverse(queue);
        System.out.println(queue);*/

        // Popular interview question - Implement a queue using an array to store the items.
        /*ArrayQueue queue = new ArrayQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        System.out.println(queue);
        queue.dequeue();
        queue.enqueue(80);
        queue.enqueue(90);*/

        // Building a queue using two stacks

        /* QueueWithTwoStacks queue = new QueueWithTwoStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        var first = queue.dequeue();
        System.out.println(first);*/

        /*PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        while (!queue.isEmpty())
            System.out.println(queue.remove());*/

        // Building a priority queue using an array
        /*PriorityQueue pQueue = new PriorityQueue();
        pQueue.add(5);
        pQueue.add(3);
        pQueue.add(8);
        pQueue.add(1);
        pQueue.add(4);
        System.out.println(pQueue);

        while(!pQueue.isEmpty())
            System.out.println(pQueue.remove()); //remove the items by their priority order

    }*/

        // QueueReverser
        /*Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        QueueReverser.reverse(queue,3);
        System.out.println(queue);*/

        //StacksWithTwoQueues
        StackWithTwoQueues stack = new StackWithTwoQueues();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}