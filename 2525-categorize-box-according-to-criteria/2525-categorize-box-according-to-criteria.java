class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        
        long volume=1L*length*width*height;
        StringBuilder ans = new StringBuilder("");
        int par1=(int)Math.pow(10,4);
        int par2=(int)Math.pow(10,9);
        if(length>=par1 || width>=par1 || height>=par1  || volume>=par2){
            //bulky
            if(mass>=100){
                //heavy
                ans.append("Both");
            }
            else{
                ans.append("Bulky");
            }
        }
        else if(mass>=100){
            //heavy
            if(length>=par1 || width>=par1 || height>=par1 || mass>=par1 || volume>=par2){
                //bulky
                ans.append("Both");
            }
            else{
                ans.append("Heavy");
            }
        }else{
            ans.append("Neither");
        }
        
        return ans.toString();
    }
}