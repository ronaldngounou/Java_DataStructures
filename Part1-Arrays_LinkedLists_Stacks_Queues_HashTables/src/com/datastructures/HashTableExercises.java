package com.datastructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class HashTableExercises {

    public int mostFrequent(int[] numbers){
        // [1, 2, 3, 3, 3, 4, 5]
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        if (numbers.length==0)
            throw new IllegalStateException("Array is empty.");

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
}
