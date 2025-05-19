package com.java.arrayBasedProblems;

/**
 *  Given an array find the index position which is equilibrium.
 */
public class EquilibriumPointInArray {

    public static void main(String[] args) {
        int[] inputArray = {0,0,1,0,1,0,0};
        EquilibriumPointInArray equilibriumPointInArray = new EquilibriumPointInArray();
        int result = equilibriumPointInArray.findEquilibriumPointInArray(inputArray);
        System.out.println(result==-1 ? "No equilibrium" : "Equilibrium Index Position is " + result);
    }

    public int findEquilibriumPointInArray(int[] inputArray)
    {
        int totalSum=0;
        int leftSum=0;
        //First we are finding out total sum of the array
        for (int inputs : inputArray){
            totalSum+= inputs;
        }

        // Iterate through the array and for each position check if left sum is equal to total - left - value at i position
        for (int i=0;i<inputArray.length;i++){
            int temp= inputArray[i];
            if(leftSum == (totalSum - leftSum - temp)) return i;
            leftSum+=leftSum+temp;
        }


        return -1;
    }
}
