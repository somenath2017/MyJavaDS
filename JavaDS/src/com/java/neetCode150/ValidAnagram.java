package com.java.neetCode150;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
 */
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println("Valid Anagram : " + checkIfValidAnagram("carrace", "racecar"));
        System.out.println("Valid Anagram : " + checkIfValidAnagram("jar", "jam"));
    }

    public static boolean checkIfValidAnagram(String s1, String s2)
    {
        if(s1.length() != s2.length()){
            return false;
        }

        Map<Character,Integer> mapS1 = new HashMap<>();
        Map<Character,Integer> mapS2 = new HashMap<>();

        for (int i=0;i<s1.length();i++){
            mapS1.put(s1.charAt(i),mapS1.getOrDefault(s1.charAt(i),0) + 1);
            mapS2.put(s2.charAt(i),mapS2.getOrDefault(s2.charAt(i),0) + 1);
        }

            return mapS1.equals(mapS2);

    }
}
