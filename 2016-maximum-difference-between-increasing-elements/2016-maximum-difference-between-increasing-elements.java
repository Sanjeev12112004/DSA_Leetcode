class Solution {
    public int maximumDifference(int[] nums) {
        int diff=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i<j && nums[j]>nums[i]){
                    diff=Math.max(diff,nums[j]-nums[i]);
                }
            }
        }
        return diff;
    }
}