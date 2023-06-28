package com.datastructures;

import java.util.Arrays;
import java.util.LinkedList;

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

        System.out.println("others");
        others.print();
        System.out.println("others reversed");
        others.reverse();
        others.print();

        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        System.out.println(list.indexOf(10));
        System.out.println(list.size());
        var array = list.toArray();
        System.out.println(Arrays.toString(array));

    }
}
