class Solution {
    public static int Count(String num){
        int k=0;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)=='0'){
                k++;
            }
            else{
                break;
            }
        }
        return k;
    }
    public String removeTrailingZeros(String num) {
       int k=Count(num);
       return num.substring(0,num.length()-k);
    }
}