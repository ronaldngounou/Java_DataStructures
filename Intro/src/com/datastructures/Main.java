package com.datastructures;

import java.util.Arrays;

public class Main {
    public static void main( String[] args){
        /*int [] numbers = new int[3];
        numbers[0] = 10;
        int [] num = {3, 4, 7};

        System.out.println(Arrays.toString(numbers));
        System.out.println(num.length);*/


        Array numbers = new Array(3);
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

        System.out.println(list.hasLoop());


    }
}
