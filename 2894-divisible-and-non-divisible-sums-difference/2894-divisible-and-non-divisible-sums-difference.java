class Solution {
    public static int Ndiv(int m,int n){
        int sum=0;
        for(int i=1;i<=n;i++){
           if(i%m!=0) sum+=i;
        }
        return sum;
    }
    public int differenceOfSums(int n, int m) {
        int num1=Ndiv(m,n);
        int num2=(n*(n+1)/2)-num1;
      return num1-num2;
    }
}