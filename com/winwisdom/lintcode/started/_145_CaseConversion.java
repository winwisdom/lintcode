package com.winwisdom.lintcode.started;

public class _145_CaseConversion {

    public static void main(String[] args) {
        System.out.println(caseConversion('a'));
    }

    public static String caseConversion(char c){
        String str = "abc";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            sb.append((str.charAt(i) >= 'a' && str.charAt(i) >= 'z') ? (char) (str.charAt(i) + 'A' - 'a') :str.charAt(i));
        }
        return sb.toString();
    }

}
