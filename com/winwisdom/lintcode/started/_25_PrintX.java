package com.winwisdom.lintcode.started;

public class _25_PrintX {

    public static void main(String[] args) {
        print(10);
    }

    /**
     * input n = 5
     * output
     * X   X
     *  X X
     *   X
     *  X X
     * X   X
     */

    public static void print(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == i || j == n-i-1){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
