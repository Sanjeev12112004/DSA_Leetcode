class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int arr[]=new int[2];
        int sum=0;
        int n=nums.length;
        int sum2=n*(n+1)/2;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                arr[0]=nums[i];
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        arr[1]=sum2-sum+arr[0];
        return arr;
    }
}