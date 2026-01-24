class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int lp=(nums.length-1)/2;
        int rp=lp+1;
        int MaxSum=Integer.MIN_VALUE; 
        while(lp>=0 && rp<nums.length){
            int cs=nums[lp]+nums[rp];
            MaxSum=Math.max(cs,MaxSum);
            lp--;
            rp++;
        }
        return MaxSum;
    }
}