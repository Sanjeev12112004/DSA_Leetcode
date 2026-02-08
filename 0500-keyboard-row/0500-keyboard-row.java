class Solution {
    public static int check(char ch, String str1, String str2, String str3){
        if(str1.indexOf(ch)!=-1){
            return 1;
        }
        else if(str2.indexOf(ch)!=-1){
            return 2;
        }
        else{
            return 3;
        }
    }
    public String[] findWords(String[] words) {
        ArrayList<String> ans= new ArrayList<>();
        String str1="qwertyuiopQWERTYUIOP";
        String str2="asdfghjklASDFGHJKL";
        String str3="zxcvbnmZXCVBNM";
        for(int i=0;i<words.length;i++){
            String curr=words[i];
            int a=0,b=0,c=0;
            for(int j=0;j<curr.length();j++){
                char ch=curr.charAt(j);
                
                int choice=check(ch,str1,str2,str3);
                if(choice==1){
                    a++;
                }
                else if(choice==2){
                    b++;
                }
                else{
                    c++;
                }
            }
            if(curr.length()==a|| curr.length()==b|| curr.length()==c){
                ans.add(curr);
            }
        }
        String list[]= new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            list[i]=ans.get(i);
        }
        return list;
    }
}