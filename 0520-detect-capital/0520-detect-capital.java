class Solution {
    public static boolean condition1(String word){
        for(int i=0;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                return false;
            }
        }
        return true;
    }
     public static boolean condition2(String word){
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static boolean condition3(String word){
        if(Character.isUpperCase(word.charAt(0))){
            for(int i=1;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean detectCapitalUse(String word) {
        if(condition1(word)){
            return true;
        }
        if(condition2(word)){
            return true;
        }
        if(condition3(word)){
            return true;
        }
        return false;
    }
}