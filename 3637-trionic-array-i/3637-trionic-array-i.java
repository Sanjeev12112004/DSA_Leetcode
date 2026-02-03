class Solution {
    public boolean isTrionic(int[] nums) {
        int i=0;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                break;
            }
        }
        if(i==0|| i==nums.length-1){
            return false;
        }
        int j=i;
        for(j=i;j<nums.length-1;j++){
            if(nums[j]<=nums[j+1]){
                break;
            }
        }
        if(j==0|| j==nums.length-1){
            return false;
        }
        for(int k=j;k<nums.length-1;k++){
            if(nums[k]>=nums[k+1]){
                return false;
            }
        }
        return true;
    }
}