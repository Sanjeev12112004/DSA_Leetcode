class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arr= new ArrayList<>();
        int ptr=1;
        Arrays.sort(nums);
        while(ptr<=nums.length){
            boolean found=false;
            int lp=0;
            int rp=nums.length-1;
            while(lp<=rp){
                int mid=(lp+rp)/2;
                if(nums[mid]==ptr){
                    found=true;
                    break;
                }
                else if(nums[mid]>ptr){
                    rp=mid-1;
                }
                else{
                    lp=mid+1;
                }
            }
            if(found==false){
                arr.add(ptr);
            }
            ptr++;
        }
        return arr;
    }
}