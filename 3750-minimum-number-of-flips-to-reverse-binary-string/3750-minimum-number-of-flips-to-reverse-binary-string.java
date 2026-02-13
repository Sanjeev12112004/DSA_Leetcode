class Solution {
    public int minimumFlips(int n) {
        String str1=Integer.toString(n,2);
        StringBuilder sb= new StringBuilder(Integer.toString(n,2));
        sb.reverse();
        String str2=sb.toString();
        int flips=0;
        for(int i=0;i<str2.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                flips++;
            }
        }
        return flips;
    }
}