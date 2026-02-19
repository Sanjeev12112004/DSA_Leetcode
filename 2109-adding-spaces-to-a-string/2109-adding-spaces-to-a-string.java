class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb= new StringBuilder("");
        int ptr=0;
        
        for(int i=0;i<s.length();i++){
            if(ptr<spaces.length && i==spaces[ptr]){
                sb.append(" ");
                sb.append(s.charAt(i));
                ptr++;
            }
            else{
             sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}