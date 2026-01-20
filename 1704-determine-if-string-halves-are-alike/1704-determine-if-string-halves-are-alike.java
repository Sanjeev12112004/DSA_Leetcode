class Solution {
    public static int CountVowels(String s){
        int count=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'|| s.charAt(i)=='A'|| s.charAt(i)=='E'|| s.charAt(i)=='I'|| s.charAt(i)=='O'|| s.charAt(i)=='U'){
                count++;
            }
        }
        return count;
    }
    public boolean halvesAreAlike(String s) {
        String a=s.substring(0,(s.length()/2));
        String b=s.substring(s.length()/2,s.length());

        int n1=CountVowels(a);
        int n2=CountVowels(b);

        return n1==n2?true:false;
    }
}