/**
 *  Java program to find frequencies of numbers in array using TreeMap.
 */

package com.mycollections;

import java.util.Map;
import java.util.TreeMap;

/**
 *  Main class.
 */
public class Main {

    public static void findFrequencies(int[] arr) {

        // Creating an empty map.
        TreeMap<Integer, Integer> myMap = new TreeMap<>();

        // Iterate through given array.
        for (int index = 0; index < arr.length; index++) {

            // Creating helping value to store current number.
            Integer counter = myMap.get(arr[index]);

            // Condition for first occurrence.
            if (counter == null) {

                myMap.put(arr[index], 1);

            }
            // Condition if number was already store in mzMap before.
            else {

                myMap.put(arr[index], ++counter);

            }
        }

        // Printing the result to console.
        for (Map.Entry elements : myMap.entrySet()) {

            // Printing number and how many times it is met in array.
            System.out.println(elements.getKey() + " frequency is " + elements.getValue());

        }
    }

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating an array of numbers.
        int[] arr = {4, 6, 8, 4, 1, 3, 9, 11, 3, 5, 7, 8, 8, 9, 4, 4, 9, 11, 12, 5, 5, 4, 9, 4, 12, 8, 7};

        // Calling method findFrequencies(int[] arr).
        Main.findFrequencies(arr);

    }
}