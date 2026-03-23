class Solution {
    public int totalMoney(int n) {
        int s1=n/7;
        int sum1=7*(s1*(8+(s1-1))/2);
        System.out.println(sum1);
        int s2=n%7;
        int start=(s1+1);
        int sum2=s2*(2*start+(s2-1))/2;
        return sum1+sum2;
    }
}