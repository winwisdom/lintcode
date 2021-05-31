package com.winwisdom.lintcode.easy;

public class _6_MergeSortedArray {

    public static void main(String[] args) {
        int[] a  = {1};
        int[] b  = {1};
        System.out.println(mergeSortedArray(a,b));
    }

    public static int[] mergeSortedArray(int[] A, int[] B){

        int[] result = new int[A.length + B.length];
        int ai = 0;
        int bi = 0;
        int ri = 0;
        while(ai < A.length || bi < B.length){
            if(ai == A.length){
                result[ri++] = B[bi++];
                continue;
            }
            result[ri++] = (bi == B.length || A[ai] < B[bi]) ? A[ai++] : B[bi++];
        }
        return result;

    }

}
