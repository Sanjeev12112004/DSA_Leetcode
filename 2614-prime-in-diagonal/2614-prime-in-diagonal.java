class Solution {
    public int diagonalPrime(int[][] nums) {
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(i==j) list.add(nums[i][j]);
            }
        }
         for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
               if(i+j==nums.length-1) list.add(nums[i][j]);
            }
        }
        Collections.sort(list);
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)<=1) continue;
            boolean flag=true;
            for(int j=2;j<=Math.sqrt(list.get(i));j++){
                if(list.get(i)%j==0) {
                    flag=false;
                    break;
                }
            }
            if(flag) return list.get(i);
        }
        return 0;
    }
}