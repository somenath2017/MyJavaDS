package com.java.neetCode150;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] arrayInput = {1,3,4,4,7,8};
        boolean retval = containsDuplicates(arrayInput);
        System.out.println("Has Duplicates :" + retval);
    }

    public static boolean containsDuplicates (int[] inputArray)
    {
        Set<Object> duplicateHashSet = new HashSet<>();
        for(int element : inputArray){
                if (duplicateHashSet.contains(element)){
                    return true;
                }
                duplicateHashSet.add(element);
        }

        return false;
    }
}
