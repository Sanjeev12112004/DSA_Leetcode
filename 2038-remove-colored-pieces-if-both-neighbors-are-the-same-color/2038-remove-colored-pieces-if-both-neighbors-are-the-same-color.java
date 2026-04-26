class Solution {
    public boolean winnerOfGame(String colors) {
        int count1=0;
        int count2=0;
        for(int i=0;i<colors.length()-2;i++){
            if(colors.charAt(i)==colors.charAt(i+1) && colors.charAt(i+1)==colors.charAt(i+2) && colors.charAt(i+2)=='A'){
                count1++;
            }
            if(colors.charAt(i)==colors.charAt(i+1) && colors.charAt(i+1)==colors.charAt(i+2) && colors.charAt(i+2)=='B'){
                count2++;
            }
        }
        if(count1>count2) return true;
        else return false;
    }
}