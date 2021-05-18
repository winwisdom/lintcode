package com.winwisdom.lintcode.started;

public class _23_JudgeNumberChar {

    public static void main(String[] args) {
        System.out.println(isNumberChar('a'));
    }

    /**
     * 判断数字与字母
     */
    public static boolean isNumberChar(char c){
        if((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')||(c >= '0' && c <= '9')){
            return true;
        }
        return false;
    }

}
