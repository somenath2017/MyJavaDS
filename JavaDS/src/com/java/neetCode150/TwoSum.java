package com.java.neetCode150;

import java.util.HashMap;


/**
 * Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] input = {4,5,2};
        int[] output = returnTwoSum(input, 7);
        System.out.println("Indices 1st " + output[0] + " 2nd :" + output[1]);
    }

    public static int[] returnTwoSum(int[] numArray, int target)
    {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        // iterate the array
        for (int i = 0; i < numArray.length; i++) {
            int num = numArray[i]; //Assign the value at index i
            int diff = target - num; // Calculate difference

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
        }
    }

