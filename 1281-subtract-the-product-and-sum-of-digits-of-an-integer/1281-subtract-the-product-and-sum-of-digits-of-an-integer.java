class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        while(n!=0){
            int l=n%10;
            sum=sum+l;
            pro=pro*l;
            n=n/10;
        }
        return pro-sum;
    }
}