class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxc=0;
        for(int i=0;i<sentences.length;i++){
            String s[]=sentences[i].trim().split(" ");
            maxc=Math.max(maxc,s.length);
        }
        return maxc;
    }
}