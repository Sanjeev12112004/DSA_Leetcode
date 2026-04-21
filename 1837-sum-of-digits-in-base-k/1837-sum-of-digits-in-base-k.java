class Solution {
    public int sumBase(int n, int k) {
        String str=Integer.toString(n,k);
        int n1=Integer.parseInt(str);
        int sum=0;
        while(n1!=0){
            sum=sum+n1%10;
            n1=n1/10;
        }
        return sum;
    }
}