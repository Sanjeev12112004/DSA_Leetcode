class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        Arrays.sort(left);
        Arrays.sort(right);
        int lmax=left.length==0?0:left[left.length-1];
        int rmax=right.length==0?0:n-right[0];
        return Math.max(lmax,rmax);
    }
}