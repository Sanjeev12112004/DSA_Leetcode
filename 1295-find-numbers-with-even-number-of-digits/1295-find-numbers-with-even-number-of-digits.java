class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if((n>9 && n<=99) || (n>999 && n<=9999)|| n==100000){
                count++;
            }
        }
        return count;
    }
}