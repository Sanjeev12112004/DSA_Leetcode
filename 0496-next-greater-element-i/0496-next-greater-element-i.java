class Solution {
    public static int LinearSearch(int arr[], int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[]= new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int n=nums1[i];
            int idx=LinearSearch(nums2,n);
            for(int j=idx+1;j<nums2.length;j++){
                if(nums2[j]>n){
                    result[i]=nums2[j];
                    break;
                }
            }
            if(result[i]==0){
                result[i]=-1;
            }
        }
        return result;
    }
}