package com.winwisdom.lintcode.started;

public class _13_Str_Find {

    public static void main(String[] args) {
        String source = "";
        String target = "";
        int index = indexOf(source,target);
        System.out.println(index);
    }

    public static int indexOf(String source, String target){
        int sourceLength = source.length();
        int targetLength = target.length();

        if(targetLength > sourceLength){
            return -1;
        }

        if(targetLength == 0){
            return 0;
        }

        for(int i = 0; i<sourceLength - targetLength + 1; i++){
            int k = i;
            for(int j = 0; j < targetLength; j ++){
                if(source.charAt(k) == target.charAt(j)){
                    if(j == targetLength -1){
                        return i;
                    }
                    k++;
                }else{
                    break;
                }
            }
        }

        return -1;
    }

}
