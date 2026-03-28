class Solution {
    public static boolean issort(ArrayList<Integer> list){
         for(int i = 1; i < list.size(); i++){
                if(list.get(i) < list.get(i - 1)){
                   return false;
                }
            }
         return true;
    }
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int n: nums){
           arr.add(n);
        }
        int res=0;
        while(!issort(arr)){
            res++;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<arr.size()-1;i++){
                min=Math.min(min,(arr.get(i)+arr.get(i+1)));
            }

            int idx=0;
            for(idx=0;idx<arr.size()-1;idx++){
                if(arr.get(idx)+arr.get(idx+1)==min){
                    break;
                }
            }
            arr.remove(idx+1);
            arr.remove(idx);
            arr.add(idx,min);
        }
        return res;
    }
}