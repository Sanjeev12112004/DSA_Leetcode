class Solution {
    public static StringBuilder add(StringBuilder sb, int idx){
        for(int i=0;i<=idx;i++){
            sb.append("a");
        }
        return sb;
    }
    public String toGoatLatin(String sentence) {
        StringBuilder ans= new StringBuilder("");
        String []arr=sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            String curr=arr[i];
            char ch=curr.charAt(0);

            if(ch=='a'|| ch=='A'|| ch=='E'|| ch=='e'|| ch=='I'|| ch=='i'|| ch=='O'|| ch=='o'||
                ch=='U'|| ch=='u'){
                    ans.append(curr);
                    ans.append("ma");
                    ans=add(ans,i);
                    ans.append(" ");
            }
            else{
                ans.append(curr.substring(1,curr.length()));
                ans.append(curr.substring(0,1));
                ans.append("ma");
                ans=add(ans,i);
                ans.append(" ");
            }
        }
        return ans.toString().trim();
    }
}