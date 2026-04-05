class Solution {
    public int mirrorFrequency(String s) {
        LinkedHashMap<Character,Character> map= new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(!map.containsKey(ch) && !map.containsValue(ch)){
                char mirror=' ';
                if(ch>='0' && ch<='9'){
                     mirror=(char)(48+'9'-ch);
                }
                else{
                     mirror=(char)(219-(int)ch);
                }

                map.put(ch,mirror);
            }
        }
        int sum=0;

        Set<Character> set=map.keySet();
       
        int freqch[]= new int[26];
        int freqd[]= new int[10];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                 freqd[ch-48]++; 
            }
            else{
                 freqch[ch-97]++;
            }
        }

        for(char key: set){
            char value=map.get(key);
            if(key>='0' && key<='9'){
              sum+=Math.abs(freqd[key-48]-freqd[value-48]);
            }
            else{
                sum+=Math.abs(freqch[key-97]-freqch[value-97]);
            }
        }
        return sum;
    }
}