class Solution {
    public static int Calc(int [] arr){
        int minabs=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int cAbs=arr[i+1]-arr[i];
            minabs=Math.min(minabs,cAbs);
        }
        return minabs;
    }
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
        Arrays.sort(arr);
        int minabs= Calc(arr);
        for(int i=0;i<arr.length-1;i++){
            int lp=i;
            int rp=i+1;
            ans=new ArrayList<>();
            if(arr[rp]-arr[lp]==minabs){
                ans.add(arr[lp]);
                ans.add(arr[rp]);
                result.add(ans);
            }
        }
        return result;
    }
}