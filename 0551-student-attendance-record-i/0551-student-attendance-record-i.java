class Solution {
    public boolean checkRecord(String s) {
        int count=0;
        if(s.length()==2){
            if(s.charAt(0)=='A' && s.charAt(1)=='A'){
                return false;
            }
        }
        int i=0;
        for(i=0;i<s.length()-2;i++){
            if((s.charAt(i)=='L'&& s.charAt(i+1)=='L'&& s.charAt(i+2)=='L')){
                return false;
            }
            if(s.charAt(i)=='A'){
                count++;
            }
        }
        for(int j=i;j<s.length();j++){
            if(s.charAt(j)=='A'){
                count++;
            }
        }
        if(count>=2){
            return false;
        }
        return true;
    }
}