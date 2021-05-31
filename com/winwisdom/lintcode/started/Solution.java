package com.winwisdom.lintcode.started;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * @param n: an integer
     * @return: return all prime numbers within n.
     */


    public static void main(String[] args) {
        System.out.println(prime(73));
    }

    public static List<Integer> prime(int n) {
        // write your code here
        List<Integer> result = new ArrayList<>();

        if(n == 2){
            result.add(n);
            return result;
        }

        if(n > 2){
            result.add(2);
        }

        for(int i = 3; i <= n;){
            if(abc(i)){
                result.add(i);
            }
            i++;
        }
        return result;
    }

    public static boolean abc(int n){
        for(int i = 3; i<n; ){
            if(n%i == 0) return false;
            i+=2;
        }
        return true;
    }
}