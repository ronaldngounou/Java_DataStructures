package com.datastructures;

import java.util.Arrays;

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


        /*StringReverser reverser = new StringReverser();
        var result = reverser.reverse(null);
        System.out.println(result);*/

        //String str = "(1+3]";
        // Edge cases
        // (
        // (()
        // ) (
        //Expression expression = new Expression();
        //System.out.println((expression.isBalanced(str)));

        Stack stack = new Stack();
        stack.push(5);
        stack.push(45);
        stack.push(35);
        stack.push(55);
        //stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);











    }
}
