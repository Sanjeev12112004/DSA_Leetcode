class Solution {
    public int findComplement(int num) {
        String a=Integer.toString(num,2);
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='0'){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        return Integer.parseInt(sb.toString(),2);
    }
}