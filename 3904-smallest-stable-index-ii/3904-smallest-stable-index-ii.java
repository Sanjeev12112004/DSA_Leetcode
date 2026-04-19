class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max[]=new int[nums.length];
        int min[]=new int[nums.length];
        int mx=Integer.MIN_VALUE;
        int mn=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            mx=Math.max(mx,nums[i]);
            max[i]=mx;   
        }
        for(int i=nums.length-1;i>=0;i--){
            mn=Math.min(mn,nums[i]);
            min[i]=mn;
        }
        for(int i=0;i<nums.length;i++){
            int a=max[i];
            int b=min[i];
            if(a-b<=k) return i;
        }
        return -1;   
    }
}