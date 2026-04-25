class Solution {
    public int compareBitonicSums(int[] nums) {
        long sum=0;
        for(int i=0; i<nums.length-1;i++){
            if(nums[i]>nums[i+1])sum-=nums[i+1];
            else sum+=nums[i];
        }
        if(sum==0)return -1;
        else if(sum>0)return 0;
        else return 1;
    }
}