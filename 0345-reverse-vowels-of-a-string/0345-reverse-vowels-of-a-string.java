class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb1=new StringBuilder("");
        StringBuilder sb2=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
               ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                   sb1.append('*');
                   sb2.append(ch);
            }
            else{
            sb1.append(ch);
            }
        }
        String rev=sb2.reverse().toString();
        int count=0;
        for(int i=0;i<sb1.length();i++){
            if(sb1.charAt(i)=='*'){
                sb1.setCharAt(i,rev.charAt(count++));
            }
        }
        return sb1.toString();
    }
}