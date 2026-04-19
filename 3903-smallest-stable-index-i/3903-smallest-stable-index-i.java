class Solution {
    public static int max(int nums[], int s, int e){
        int max=Integer.MIN_VALUE;
        for(int i=s;i<=e;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
    public static int min(int nums[], int s, int e){
        int min=Integer.MAX_VALUE;
        for(int i=s;i<=e;i++){
            min=Math.min(min,nums[i]);
        }
        return min;
    }
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int a=max(nums,0,i);
            int b=min(nums,i,nums.length-1); 
            if(a-b<=k) return i;
        }
        return -1;
    }
}