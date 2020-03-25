package com.leetcodeproblems.practice;

public class AnalyzeOrder {


    public static void main(String  args[]){


        int m = 0;
        int n = 0;


        for(; m!= n; ){

            
        }
    }

    //pseudo code
    /**
     * sum 0 ----------------- > 1 unit
     * Begin ; sum(A) ------------------
     * for(num: A) -------------- n +1
     * sum += num; ----------------- n
     *
     * End; return sum --------------------- 1unit time
     *  f(n) = n + 1 + n + 1 + 1
     *       = 2n + 3
     *
     *       O(n)
     *
     *       f(n) = x^6 + 2x + 3
     *
     *  space
     *      *                                               sum ------- 1 unit
     *      *                                               num -------- n
     *      *                                               A ------------ n+ 1
     *
     *
     * Begin;
     * target 0; ---------------------- 1 unit/t
     * Begin; twoSum(A, target); ------------ 1
     * for(num: A) ---------------  n + 1
     * for(numJ: i+ 1) -------------- n(n+1)
     *   if num[i] + num[j] == targets --------- n(n+ 1)
     *
     * End: return new int [] {i,j}; ------ 1unit
     *
     * f(n) = 1 + 1 + n + 1 + n^2 + n + n^2 + n + 1
     *      f(n)=  2n^2 + 3n +  4
     *
     *      O(n2)
     *
     * for(i = 1; i < n; i = i + 3) -------- n+ 1
     *
     *    print i
     *
     *    f(n) =  n / 3
     *
     *
     * f0r(i = 1; i <= n; i++ )
     * k > \/n
     *
     *
     * for(num : A) ----------- n + 1
     *   statement; ---------------- n
     *
     * for(num : B) --------------- n + 1
     * statement; ----------------------------- n
     *
     * f(n) = n+1 + n + n+1 + n
     *      = 4n + 2
     *
     *
     *  m = A.length
     *
     *  for(i = 0; i < m; i++){
     *
     *      sum += m
     *
     *  }
     *
     *  while(i < m ){ ----------- m
     *
     *      sum += m; -------------- m
     *      i++; -------------------------- 1
     *
     *
     *
     *  }
     *
     *
     * Begin :
     * m = 0
     * n = 0
     * while( (16)m != n (2)){ ------------ n + 1
     *     if(m > n){
     *         m = m - n; -------- n
     *
     *     }else{
     *          n = n- m; ----------- n
     *     }
     *
     *
     *
     * }
     *
     *best case O(1)
     * worst 0(n)
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */





}
