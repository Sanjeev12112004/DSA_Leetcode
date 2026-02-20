class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer> map1= new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();

        for(int i=0;i<word1.length();i++){
            if(map1.containsKey(word1.charAt(i))){
                map1.put(word1.charAt(i),map1.get(word1.charAt(i))+1);
            }
            else{
                map1.put(word1.charAt(i),1);
            }
        }
        for(int i=0;i<word2.length();i++){
            if(map2.containsKey(word2.charAt(i))){
                map2.put(word2.charAt(i),map2.get(word2.charAt(i))+1);
            }
            else{
                map2.put(word2.charAt(i),1);
            }
        }

        Set<Character> set=map1.keySet();
        //set.add(map2.keySet());
        Set<Character> set2=map2.keySet();
        for(int i=0;i<word1.length();i++){
            char ch=word1.charAt(i);
            
                if(Math.abs(map1.getOrDefault(ch,0)-map2.getOrDefault(ch,0))>3){
                    return false;
                }   
        }
        for(int i=0;i<word2.length();i++){
            char ch=word2.charAt(i);
            
                if(Math.abs(map1.getOrDefault(ch,0)-map2.getOrDefault(ch,0))>3){
                    return false;
                }   
        }
        return true;
    }
}