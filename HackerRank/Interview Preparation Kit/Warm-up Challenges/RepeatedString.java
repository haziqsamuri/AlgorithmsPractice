public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        char[] string = s.toCharArray();
        int numA = 0;
        long reps = n /string.length;
        long remainder = n % string.length;
        long totalReps = 0;
        for(char c : string){
            if(c == 'a'){
                numA++;
            }
        }
        totalReps += reps * numA;

        if(remainder == 0){
            return totalReps;
        }
        else{
            int remA = 0;
            for(int i = 0; i < remainder; i++){
                if (string[i] == 'a') {
                    remA++;
                }
            }
            return totalReps + remA;
        }

    }
}