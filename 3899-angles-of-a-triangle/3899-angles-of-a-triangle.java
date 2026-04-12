class Solution {
    public double[] internalAngles(int[] sides) {
        double a=sides[0];
        double b=sides[1];
        double c=sides[2];
        
        double result[]=new double[3];
        if(a+b<=c || b+c<=a || a+c<=b){
            return new double[0];
        }

        result[0]=Math.toDegrees(Math.acos((b*b+c*c-a*a)/(2*b*c)));
        result[1]=Math.toDegrees(Math.acos((a*a+c*c-b*b)/(2*a*c)));
        result[2]=(180-result[0]-result[1]);
        Arrays.sort(result);
        return result;
    }
}