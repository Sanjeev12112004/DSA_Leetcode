class Solution {
    public boolean rotateString(String s, String goal) {
        int k=s.length();
        List<String> results= new ArrayList<>();
        results.add(s);
        char str[]= s.toCharArray();
        while(k!=0){
            char last=str[str.length-1];
             for(int i=str.length-2;i>=0;i--){
                str[i+1]=str[i];
             }
             str[0]=last;
             String newString= new String(str);
             results.add(newString);
             k--;
        }
        if(results.contains(goal)){
            return true;
        }
        else{
            return false;
        }
    }
}