class Solution {
    public int compareVersion(String version1, String version2) {
        int i=0;
        int j=0;
        while(i<version1.length() || j<version2.length()){
              StringBuilder sb1= new StringBuilder("");
              StringBuilder sb2= new StringBuilder("");
              for(int idx=i;idx<version1.length();idx++,i++){
                    if(version1.charAt(idx)=='.'){
                        i++;
                        break;
                    }
                    else{
                        sb1.append(version1.charAt(idx));
                    }
                }
              for(int idx=j;idx<version2.length();idx++,j++){
                    if(version2.charAt(idx)=='.'){
                        j++;
                        break;
                    }
                    else{
                        sb2.append(version2.charAt(idx));
                    }
                }
                int num1 =sb1.length() == 0?0:Integer.parseInt(sb1.toString());
                int num2 =sb2.length() == 0?0:Integer.parseInt(sb2.toString());
                if(num1<num2) return -1;
                else if(num1>num2) return 1;
            }
        return 0;
    }
}