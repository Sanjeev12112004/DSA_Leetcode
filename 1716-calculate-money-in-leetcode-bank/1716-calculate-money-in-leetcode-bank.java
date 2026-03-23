class Solution {
    public int totalMoney(int n) {
        return 7*((n/7)*(8+((n/7)-1))/2)+(n%7)*(2*((n/7)+1)+((n%7)-1))/2;
    }
}