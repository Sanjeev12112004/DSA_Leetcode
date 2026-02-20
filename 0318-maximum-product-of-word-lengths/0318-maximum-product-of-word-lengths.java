class Solution {
    public static boolean nocommon(String word1,HashSet<Character> sets){
        for(int i=0;i<word1.length();i++){
            if(sets.contains(word1.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static void createSet(String word,HashSet<Character> set){
        for(int i=0;i<word.length();i++){
            set.add(word.charAt(i));
        }
    }
    public int maxProduct(String[] words) {
        int maxpro=0;
        HashSet<Character>[] sets = new HashSet[words.length];

        for(int i = 0; i < words.length; i++){
                  sets[i] = new HashSet<>();
                  createSet(words[i], sets[i]);
        }
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                    
                    if(nocommon(words[i],sets[j])){
                        maxpro=Math.max(maxpro,(words[i].length()*words[j].length()));
                    }
            }
        }
        return  maxpro;
    }
}