package com.winwisdom.lintcode.easy;

public class _8_RotateString {

    public static void main(String[] args) {
        char[] str = new char[]{'a','b','c','d','e','f','g'};
        System.out.println(rotateString(str,3));
        System.out.println(rotateString2(str,3));
    }

    public static char[] rotateString(char[] str, int offset) {
        if(str == null || str.length == 0)
            return str;
        offset = offset % str.length;
        reverse(str,0,str.length-1);
        reverse(str,0,offset -1);
        reverse(str,offset,str.length-1);
        return str;
    }

    public static char[] rotateString2(char[] str, int offset) {
        if(str == null || str.length == 0)
            return str;
        offset = offset % str.length;

        for(int j = 0; j < offset; j++){
            for(int i = 0; i < str.length; i++){
                //TODO
            }
        }
        return str;
    }

    public static void reverse(char[] str, int start, int end){
        char tmp;
        while(end > start){
            tmp = str[start];
            str[start] = str[end];
            str[end] = tmp;
            end--;
            start++;
        }
    }

}
