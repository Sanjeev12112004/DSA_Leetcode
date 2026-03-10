class Solution {
    public int arraySign(int[] nums) {
        int pro=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) return 0;
            pro=pro*(nums[i]>0?1:-1);
        }
        return pro;
    }
}