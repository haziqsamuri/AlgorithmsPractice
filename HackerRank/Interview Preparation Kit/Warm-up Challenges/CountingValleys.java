public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        boolean inValley = false;
        int seaLevel = 0;
        char[] steps = s.toCharArray();
        int numValleys = 0;
        for(char c : steps){
            if(c == 'D'){
                seaLevel--;
            }
            else{
                seaLevel++;
            }
            if(c == 'D' && !inValley && seaLevel <0){
                inValley = true;
                numValleys++;
            }
            if(c == 'U' && inValley && seaLevel == 0){
                inValley = false;
            }
        }
        return numValleys;

    }
}