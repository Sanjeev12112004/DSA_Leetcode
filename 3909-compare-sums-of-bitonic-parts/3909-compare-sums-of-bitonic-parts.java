class Solution {
    public int compareBitonicSums(int[] nums) {
        long sum1=0;
        long sum2=0;
        boolean flag=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                sum1=sum1+nums[i];
                flag=true;
            }
            else{
                sum2=sum2+nums[i];
                if(flag){
                    sum1=sum1+nums[i];
                    flag=false;
                }
            }
        }
        sum2=sum2+nums[nums.length-1];
        System.out.println(sum1+" "+sum2);
        if(sum1>sum2) return 0;
        else if(sum2>sum1) return 1;
        return -1;
    }
}