class Solution {
    public static StringBuilder reverse(StringBuilder str){
        StringBuilder re= new StringBuilder("");
        for(int i=str.length()-1;i>=0;i--){
            re.append(str.charAt(i));
        }
        return re;
    }
    public String finalString(String s) {
        StringBuilder sb= new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                sb=reverse(sb);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}