class Solution {
    public String sortVowels(String s) {
        char vowel[]= new char[s.length()];
        StringBuilder sb= new StringBuilder("");
        int curr=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
               ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                   sb.append('*');
                   vowel[curr++]=ch;
              }
              else{
                sb.append(ch);
              }
        }
        Arrays.sort(vowel,0,curr);
        curr=0;
        for(int i=0;i<s.length();i++){
            if(sb.charAt(i)=='*'){
                sb.setCharAt(i,vowel[curr++]);
            }
        }
        return sb.toString();
    }
}