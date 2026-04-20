class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,Math.abs(nums[i]-nums[i+1]));
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}