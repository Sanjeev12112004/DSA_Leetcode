import java.util.*;
class Solution {
    public static int LCS(int arr1[], int arr2[]){
        int n=arr1.length;
        int m=arr2.length;

        int dp[][]= new int[n+1][m+1];
        //already initializes with 0 in java
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){

                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public int lengthOfLIS(int[] arr1) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        
        int i=0;
        int arr2[]= new int[set.size()];
        for(int num: set){
            arr2[i++]=num;
        }
        Arrays.sort(arr2);
        return LCS(arr1,arr2);
    }
}