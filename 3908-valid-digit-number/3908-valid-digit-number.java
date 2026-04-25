class Solution {
    public boolean validDigit(int n, int x) {
        // int rev=0;
        // int n2=n;
        // while(n2!=0){
        //     int l=n2%10;
        //     rev=rev*10+l;
        //     n2=n2/10;
        // }
        // if(rev%10==x) return false;
        int last=-1;
        boolean found=false;
        while(n!=0){
            if(n%10==x){
                found=true;
            }
            last=n%10;
            n=n/10;

        }
        return found && (last!=x);
    }
}