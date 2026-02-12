class Solution {
    public static void StoreStrings(String str[], HashMap<String,Integer> map){
        for(int i=0;i<str.length;i++){
            if(map.containsKey(str[i])){
                map.put(str[i],map.get(str[i])+1);
            }
            else{
                map.put(str[i],1);
            }
        }
    }
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map= new HashMap<>();
        String str1[]=s1.split(" ");
        String str2[]=s2.split(" ");

        StoreStrings(str1,map);
        StoreStrings(str2,map);
        ArrayList<String> ans= new ArrayList<>();
        Set<String> keys=map.keySet();
        for(String k : keys){
            if(map.get(k)==1){
                ans.add(k);
            }
        }
        String s[]= new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            s[i]=ans.get(i);
        }
        return s;
    }
}