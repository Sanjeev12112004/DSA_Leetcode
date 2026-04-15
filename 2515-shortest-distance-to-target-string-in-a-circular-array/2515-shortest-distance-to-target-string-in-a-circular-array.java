class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int count1=0,count2=0;
        int i=startIndex;
        while(count1<words.length){
            if(words[i].equals(target)){
                break;
            }
            count1++;
            i=(i+1)%words.length;
        }
        int j=startIndex;
        while(count2<words.length){
            if(words[j].equals(target)){
                break;
            }
            count2++;
            j=(j-1+words.length)%words.length;
        }
        return (count1==count2 && count1==words.length)?-1:Math.min(count1,count2);       
    }
}