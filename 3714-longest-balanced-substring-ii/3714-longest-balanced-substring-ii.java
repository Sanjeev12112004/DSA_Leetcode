class Solution {
    public static int helper(String s, char ch1, char ch2){
        int n=s.length();
        int maxL=0;
        HashMap<Integer,Integer> diffMap= new HashMap<>();
        int count1=0;
        int count2=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)!=ch1 && s.charAt(i)!=ch2){
                    diffMap=new HashMap<>();
                    count1=0;
                    count2=0;
                    continue;
            }
            if(s.charAt(i)==ch1){
                count1++;
            }
            if(s.charAt(i)==ch2){
                count2++;
            }

            if(count1==count2){
                maxL=Math.max(maxL,count1+count2);
            }

            int diff=count1-count2;
            if(diffMap.containsKey(diff)){
                maxL=Math.max(maxL,i-diffMap.get(diff));
            }
            else{
                diffMap.put(diff,i);
            }
        }
        return maxL;
    }
    public int longestBalanced(String s) {
        int n=s.length();
        int maxL=0;

        // case 1:
        int count=1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                maxL=Math.max(maxL,count);
                count=1;
            }
        }
        maxL=Math.max(maxL,count);

        // case 2:
        maxL=Math.max(maxL,helper(s,'a','b'));
        maxL=Math.max(maxL,helper(s,'a','c'));
        maxL=Math.max(maxL,helper(s,'b','c'));

        //case 3:
        int countA=0;
        int countB=0;
        int countC=0;
        HashMap<String, Integer> map= new HashMap<>();

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a'){
                countA++;
            }
            if(s.charAt(i)=='b'){
                countB++;
            }
            if(s.charAt(i)=='c'){
                countC++;
            }

            if(countA==countB && countA==countC){
                maxL=Math.max(maxL,countA+countB+countC);
            }

            int diffAB=countA-countB;
            int diffAC=countA-countC;

            String key= Integer.toString(diffAB)+"_"+Integer.toString(diffAC);
            if(map.containsKey(key)){
                maxL=Math.max(maxL,i-map.get(key));
            }
            else{
                map.put(key,i);
            }
        }
        return maxL;
    }
}