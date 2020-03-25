package com.leetcodeproblems.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Practice {


    public static void main(String[] args){

        String s1 = "HomeMade";
        String s2 = "School";
        int[] ar = {2,3,4,3,5,2,5};
        System.out.println(compareStrings(s1,s2));
        System.out.println(findUnique(ar));

        basicHashMapImplementation();


    }


    static void basicHashMapImplementation(){

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Madona");
        map.put(2, "Muthoka");
        map.put(3,"Kavyu");
        map.put(4, "Kisomo");

        //iterate through the map and print the added elements
        for(Map.Entry<Integer,String > m : map.entrySet()){

            System.out.println(m.getKey() + " " + m.getValue());
            System.out.println();

        }


    }

    //Question 2. Given an array of all duplicates with 1 unique element find that element
    // I know of the  XOR(Exclusive or) or we can use the Exclusive Or logical biconditional,
    // which outputs true only when the two inputs are the same.
    // that would helps us walk O(n) times to find the number
    static int findUnique(int[] arr){

        int results = arr[0]; // to hold our first position

        // for loop to loop through the array the use the XOR
        for(int i = 1 ; i < arr.length; i++)

            results = results ^ arr[i]; // the way the XOR works is it takes the number that are the same and matches them.
        // i.e (2^2) (3^3) (4^0) like that so basically 4 is matched to 0

        return results; // return what we found the unique element


    }



    // Questions 1. Compare 2 strings
    // general idea is we can use String.equals a method in java to check if they're similar
    // We can also use Strings.equalsIgnoreCase where we ignore case but get a solution
    // or we can use Objects.equals which accepts two arguments.
    // We can also write our own process which follows the convention
    // if(string1 > string2) return positive number | if string1 < string 2 return negative
    // or if string1 == string2 then return 0
    static int compareStrings(String a, String b){
        int length1 = a.length(); // to hold length one
        int length2 = b.length(); // to hold length two

        int minL = Math.min(length1,length2); // getting the minimum of the the two strings

         for(int i = 0 ; i <minL ; i++){

             int fChar = a.charAt(i); // get their character index
             int sChar = b.charAt(i); // get the second character

             if(fChar != sChar){

                 return fChar - sChar;
             }

         }
         if (length1 != length2){

             return length1 - length2; // edge case
         }else {
             return 0; //
         }

    }


}
