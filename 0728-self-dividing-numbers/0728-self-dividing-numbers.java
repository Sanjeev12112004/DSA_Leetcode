class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list= new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i<=9 && i>0){
                list.add(i);
            }
            else{
                int n2=i;
                boolean flag=true;
                while(n2!=0){
                    int l=n2%10;
                    if(l==0){
                        flag=false;
                        break;
                    }
                    else if(i%l!=0){
                        flag=false;
                        break;
                    }
                    n2=n2/10;
                }
                if(flag) list.add(i);
            }
        }
        return list;
    }
}