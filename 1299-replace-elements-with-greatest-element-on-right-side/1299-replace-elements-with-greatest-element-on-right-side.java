class Solution {
    public int[] replaceElements(int[] arr) {
       int result[]= new int[arr.length];
       for(int i=0;i<arr.length-1;i++){
           int max=Integer.MIN_VALUE;
           for(int j=i+1;j<arr.length;j++){
               max=Math.max(max,arr[j]);
           }
           result[i]=max;
       }
       result[arr.length-1]=-1;
       return result;
    }
}