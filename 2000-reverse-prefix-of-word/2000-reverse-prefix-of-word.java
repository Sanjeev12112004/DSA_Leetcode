class Solution {

    public String reversePrefix(String word, char ch) {
        int k=word.indexOf(ch);
        String sub1=word.substring(0,k+1);
        String sub2=word.substring(k+1,word.length());
        
        String reversed = new StringBuilder(sub1).reverse().toString();
        return reversed+sub2;
    }
}