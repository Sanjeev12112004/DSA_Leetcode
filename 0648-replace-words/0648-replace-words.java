class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Collections.sort(dictionary);
        StringBuilder sb= new StringBuilder("");
        String arr[]=sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            String curr=arr[i];
            boolean flag=false;
            for(String word: dictionary){
                if(curr.startsWith(word)){
                   sb.append(word);
                   sb.append(" ");
                   flag=true;
                   break;
                }
            }
            if(!flag){
             sb.append(curr);
             sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}