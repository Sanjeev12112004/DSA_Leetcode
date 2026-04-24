class Solution {
    public boolean canAliceWin(int n) {
        int start=10;
        int count1=2;//alice
        while(true){
            if(count1%2==0){
                if(n<start){
                    return false;
                }
                else{
                     n=n-start;
                     start--;
                     count1++;
                }
            }
            else{
                if(n<start){
                    return true;
                }
                else{
                    n=n-start;
                    start--;
                    count1++;
                }
            }
        }
    }
}