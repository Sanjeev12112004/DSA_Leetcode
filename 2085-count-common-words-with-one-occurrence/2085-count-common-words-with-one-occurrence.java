class Solution {
    public static boolean check(String str, String words2[]){
        int count=0;
        for(int i=0;i<words2.length;i++){
            if(words2[i].equals(str)){
                count++;
            }
        }
        if(count==1) return true;
        return false;
    }
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map= new HashMap<>();
        for(int i=0;i<words1.length;i++){
            if(map.containsKey(words1[i])){
                map.put(words1[i],map.get(words1[i])+1);
            }
            else{
                map.put(words1[i],1);
            }
        }
        int count=0;
        Set<String> set=map.keySet();
        for(String str: set){
            if(map.get(str)==1 && check(str,words2)){
                count++;
            }
        }
        return count;
    }
}