package com.datastructures;

public class Array {
    // Store and access elements by their index
    // Lookup O(1)
    // Delete O(n)

    //Fields
    private int[] items;
    private int count; //count represents the total number of items currently in the array, not the size of the array.

    //Constructor
    public Array(int length) {
        items = new int[length]; // initialize the items array based on the initial length.
    }

    //Methods
    public void print(){
        for (int i = 0; i<count; i++)
            System.out.println(items[i]);
    }

    public void insert(int num){
        // If the array is full, resize it
        if (items.length == count){
            // Create a new array (twice the size)
            int[] new_array = new int[count * 2];

            // Copy all the existing items
            for (int i=0; i<count; i++)
                new_array[i] = items[i];

            // Set the items field to be the new_array
            items = new_array;
        }

        // Add the new item at the end
        items[count] = num;
        count++;
    }

    public void removeAt(int index){
        // Validate the index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        // Shift the items to the left to fill the hole
        for (int i=index; i< count; i++)
            items[i] = items[i+1];
        count --;

    }

}
