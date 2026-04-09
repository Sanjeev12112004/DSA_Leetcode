class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> result= new ArrayList<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                result.add(arr[i]);
            }
            else{
                result.add(arr[i]);
                result.add(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=result.get(i);
        }
    }
}