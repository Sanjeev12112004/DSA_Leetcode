class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int columns=encodedText.length()/rows;
        StringBuilder sb= new StringBuilder("");

        for(int col=0;col<columns;col++){
            for(int j=col;j<encodedText.length();j+=(columns+1)){
                sb.append(encodedText.charAt(j));
            }
        }
        int i=sb.length()-1;
        while(i>=0){
            if(sb.charAt(i)!=' '){
                break;
            }
            i--;
        }
        return sb.toString().substring(0,i+1);

        //return sb.toString().trim();
    }
}