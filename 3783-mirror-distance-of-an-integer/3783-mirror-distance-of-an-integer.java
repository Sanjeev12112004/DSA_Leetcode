class Solution {
    public int mirrorDistance(int n) {
        int n2=n;
        int rev=0;
        while(n2!=0){
            int l=n2%10;
            rev=rev*10+l;
            n2=n2/10;
        }
        return Math.abs(n-rev);
    }
}