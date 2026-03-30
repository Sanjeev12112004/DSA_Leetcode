class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result= new ArrayList<>();
        StringBuilder sb= new StringBuilder("");
        for(int i=0;i<nums.length;i++){
            int start=nums[i];
            while(i<nums.length-1 && nums[i]+1==nums[i+1]){
                i++;
            }
            if(start==nums[i]){
                result.add(Integer.toString(start));
            }
            else{
                result.add(Integer.toString(start)+"->"+Integer.toString(nums[i]));
            }
         }
        return result;
    }
}