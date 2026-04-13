class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list= new ArrayList<>();
        int count=1;
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                if(count<2){
                list.add(nums[i]);
                count++;
                }
                else{
                    continue;
                }
            }
            else{
                list.add(nums[i]);
                count=1;
            }
        }
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return list.size();
    }
}