class Solution {
    public boolean scoreBalance(String s) {
        int ls=0;
        for(int i=0;i<s.length()-1;i++){
             int rs=0;
             ls=ls+(int)s.charAt(i)-96;
            for(int j=i+1;j<s.length();j++){
              rs=rs+(int)s.charAt(j)-96;   
            }
            if(ls==rs){
                return true;
            }
        }
        return false;
    }
}