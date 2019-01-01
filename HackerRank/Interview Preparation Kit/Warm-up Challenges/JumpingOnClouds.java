public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int numJumps = 0;
        int currentCloud = 0;
        while(currentCloud < c.length - 1){
            if(currentCloud == (c.length - 2) || c[currentCloud + 2] == 1 ){
                currentCloud++;
            }
            else{
                currentCloud += 2;
            }
            numJumps++;
        }
        return numJumps;

    }
}