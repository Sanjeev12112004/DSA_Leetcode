class Solution {
    public int alternateDigitSum(int n) {
        int rev=0;
        while(n!=0){
            int l=n%10;
            rev=rev*10+l;
            n=n/10;
        }
        int count=2;
        int sum=0;
        while(rev!=0){
            if(count%2==0){
                sum=sum+rev%10;
            }
            else{
                sum=sum-rev%10;
            }
            count++;
            rev=rev/10;
        }
        return sum;
    }
}