class Solution {
    public int count(String n){
        int count=0;
        for(int i=0;i<n.length();i++) 
          {if(n.charAt(i)=='1') count++;
          }
        return count;
    }
    public int hammingWeight(int n) {
        return count(Integer.toString(n,2));
    }
}