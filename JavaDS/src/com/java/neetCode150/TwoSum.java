package com.java.neetCode150;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
 */
public class TwoSum {

    public static void main(String[] args) {

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

