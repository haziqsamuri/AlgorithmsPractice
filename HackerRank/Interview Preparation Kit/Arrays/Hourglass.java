//Easy challenge

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int sumHourglass = 0, maxHourglass = -63;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                for(int hourglassRow = i; hourglassRow <= i + 2; hourglassRow++){
                    for(int hourglassCol = j; hourglassCol <= j + 2;  hourglassCol++){
                        if(hourglassRow == i + 1 && hourglassCol != j + 1){
                            continue;
                        }
                        else{
                            sumHourglass += arr[hourglassRow][hourglassCol];
                        }
                    }
                }
                if(sumHourglass > maxHourglass){
                    maxHourglass = sumHourglass;
                }
                sumHourglass = 0;
            }
        }
        return maxHourglass;
    }
}