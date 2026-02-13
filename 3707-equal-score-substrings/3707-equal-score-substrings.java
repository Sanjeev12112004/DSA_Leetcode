class Solution {
    public boolean scoreBalance(String s) {
        int sum=0;
        for(int i=1;i<s.length();i++){
            sum=sum+((int)s.charAt(i)-96);
        }

        int ls=(int)s.charAt(0)-96;
        for(int i=0;i<s.length()-1;i++){
            if(ls!=sum){
                sum=sum-((int)s.charAt(i+1)-96);
                ls=ls+((int)s.charAt(i+1)-96);
            }
            else{
                return true;
            }
        }
        return false;
    }
}