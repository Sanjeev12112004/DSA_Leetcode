class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int temp[]= new int[nums1.length+nums2.length];
      
      int i=0;
      int j=0;
      int k=0;
    while(i<nums1.length && j<nums2.length){
           if(nums1[i]>nums2[j]){
            temp[k]=nums2[j];
            j++;
           }
           else{
            temp[k]=nums1[i];
            i++;
           }
           k++;     
    }
    while(i<nums1.length){
        temp[k++]=nums1[i++];
    }
    while(j<nums2.length){
        temp[k++]=nums2[j++];
    }
    int n=(temp.length)/2;

    if(temp.length%2!=0){
        return (double)temp[n];
    }
    else{
        int s=0;
        int end= temp.length-1;
        int mid=(s+end)/2;

        return  (double)(temp[mid]+temp[mid+1])/2;
    }
    
  }
}