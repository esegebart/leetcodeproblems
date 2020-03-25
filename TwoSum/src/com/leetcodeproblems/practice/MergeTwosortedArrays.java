package com.leetcodeproblems.practice;

import java.util.Arrays;

public class MergeTwosortedArrays {



    public static void main (String [] args){


        int a [] = {17, 28 , 30};
        int b [] = { 4, 8, 16, 98};


        System.out.println(Arrays.toString(merge(a, b)));

    }


    static int [] merge(int A[], int B[]){
        int i = 0, j = 0, k= 0;
        int C [] = new int [7];

        while(i <= A.length - 1 && j <= B.length -1){

            if(A[i] < B[j]){

                C[k++] = A[i++];
            }else{
                 C[k++] = B[j++];

            }
        }


        for( ; i <= A.length - 1; i++ ){

            C[k++] = A[i];
        }

        for(; j <= B.length - 1; j++){

            C[k++] = B[j];
        }

        return C;
    }


}
