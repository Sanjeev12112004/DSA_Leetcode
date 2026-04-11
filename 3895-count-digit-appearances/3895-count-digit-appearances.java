class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        StringBuilder sb= new StringBuilder("");
        for( int n: nums){
            sb.append(Integer.toString(n));
        }
        int count=0;
        for(int i=0;i<sb.length();i++){
            System.out.println(i);
            if((sb.charAt(i)==digit+48)){
               count++;
            } 
        }
        System.out.println(sb);
        return count;
    }
}