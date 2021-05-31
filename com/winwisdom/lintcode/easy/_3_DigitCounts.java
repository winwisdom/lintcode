package com.winwisdom.lintcode.easy;

public class _3_DigitCounts {

    public static void main(String[] args) {
        System.out.println(digitCounts(0,9));
    }

    public static int digitCounts(int k, int n) {
        int result = 0;
        for(int i = 0; i <= n; i++){
            int tmp = i;
            int mod;
            while(tmp >= 0){
                mod = tmp % 10;
                tmp/=10;
                if(mod == k){
                    result++;
                }
                if(tmp == 0){
                    break;
                }
            }
        }
        return result;
    }

}
