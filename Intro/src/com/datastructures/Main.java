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

        System.out.println(numbers.indexOf(44));

        System.out.println(numbers.max());
    }
}
