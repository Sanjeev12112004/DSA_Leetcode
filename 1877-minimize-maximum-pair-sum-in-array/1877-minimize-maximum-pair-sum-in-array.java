class Solution {
    public int minPairSum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length-1;
        int lp=n/2;
        int rp=lp+1;
        int fmax=2;

        while(lp>=0&&rp<(n+1)){
                int cs=arr[lp]+arr[rp];
                fmax=Math.max(fmax,cs);
                lp--;
                rp++;

        }
        return fmax;
    }
}