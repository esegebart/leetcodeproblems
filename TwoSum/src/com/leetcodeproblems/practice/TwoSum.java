package com.leetcodeproblems.practice;

import java.util.Arrays;

public class TwoSum {

    /**Given an array of integers, return indices of the two numbers such that they add up to a specific target.
       You may assume that each input would have exactly one solution, and you may not use the same element twice.
       Given nums = [2, 7, 11, 15], target = 9,
       Because nums[0] + nums[1] = 2 + 7 = 9,
       return [0, 1]. */

    public static void main(String[] args){
        // To hold the nums input [array]
        int nums [] = {2,7,11,15};
                // input two {1, 3, 4, 11, 15, 7, 2};

        // To hold target (expected sum of two nums)
        int target = 9;

        //To return indices which is array[0,1]
        // (If we don't print Arrays.toString we will be given garbage)
       System.out.println(Arrays.toString(twoSums(nums, target)));

        sumArray(nums);
    }

    /** TwoSums method - static because we are returning a specific type */
    static int [] twoSums(int [] num, int targets) {
        // Equation with variables: nums[i] + nums[j] == target (return the indices)
        // Visualize an array indices {0,1,2,3,4} my i = nums.length
        // Visualize another array J = i+1 {1,2,3,4};
        // nums [2,7,11,15];
        // NOTE: Visualize J = i + 1; When i=0, j will start at 1
        // The if statement is used to check if the condition matches the target

        for(int i=0; i < num.length; i++) {
            for(int j= i+1; j<num.length; j++) {
                if (num[i] + num[j] == targets){
                    // return new int array because the return type is Array.toString
                    return new int [] {i,j};
                }
            }
        }
        return null;
    }

    static void sumArray(int nu[]){

        int sum = 0; // ------  1 unit time

        for(int num : nu){ // ------------ n + 1

            sum+= num; // ------------- n times
        }

        System.out.println(sum); // times function is f(n) = 2n + 3
        // hence the degree of the polynomial is Order(n) or O(n)
    }
}

