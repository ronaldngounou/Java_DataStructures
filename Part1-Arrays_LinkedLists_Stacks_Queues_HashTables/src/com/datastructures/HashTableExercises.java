package com.datastructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExercises {

    public int mostFrequent(int[] numbers){
        // [1, 2, 3, 3, 3, 4, 5]
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        checkIfArrayEmpty(numbers);

        for (int number : numbers){
            var count = map.containsKey(number) ? map.get(number) : 0; //map.getOrDefault(number, 0)
            map.put(number, count+1);
            set.add(number);

        }
        int max = -1;
        int value=numbers[0];
        for (int item : set){
            if (map.get(item) > max){
                max = map.get(item);
                value = item;
            }
        }
        return value;


    }

    public int countPairsWithDiff(int[] numbers, int K){
        //iterate over the array
        // put all the numbers in a set
        //if set.contains(number + K)
        //    increment counter
        //    add the number in hashmap

        // [1, 7, 5, 9, 2, 12, 3]
        // S = 1, 7, 5, 9, 2, 12, 3
        HashSet<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        checkIfArrayEmpty(numbers);

        for (var number : numbers)
            set.add(number);


        int counter = 0;
        for (int num : set){
            if (set.contains(num+K)){
                map.put(num, num+K);
                counter++;
            }
        }

        /*for (int number : numbers){
            if (set.contains(number + K))
                counter++;
            if (set.contains(number-K))
                counter++;
            set.remove(number);
        }*/

        return counter;

    }

    private static void checkIfArrayEmpty(int[] numbers) {
        if (numbers.length==0)
            throw new IllegalStateException("Array is empty.");
    }
}
