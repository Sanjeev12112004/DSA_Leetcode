class Solution {
    static class Pair{
        String word;
        int level;
        public Pair(String s, int l){
            this.word=s;
            this.level=l;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set= new HashSet<>();
        for(String word: wordList){
            set.add(word);
        }
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(beginWord,1));
        set.remove(beginWord);

        while(!q.isEmpty()){
            Pair curr=q.remove();
            String word=curr.word;
            int level=curr.level;

            if(word.equals(endWord)){
                return level;
            }
            for(int i=0;i<word.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char []charArray= word.toCharArray();
                    charArray[i]=ch;
                    String newWord= new String(charArray);
                    if(set.contains(newWord)){
                        q.add(new Pair(newWord,level+1));
                        set.remove(newWord);
                    }
                }
            }
        }
        return 0;
    }
}