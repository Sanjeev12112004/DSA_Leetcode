class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                s=i;
                break;
            }
        }
        int e=-1;
         for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                e=i;
            }
        }
        int result[]={s,e};
        return result;

    }
}