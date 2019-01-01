public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int fastPointer = 0;
        int currentVal = a[0], nextVal = a[0];
        int numSwaps = 0;
        while(numSwaps < a.length){
            fastPointer = newIndex(fastPointer, d, a.length);
            currentVal = nextVal;
            nextVal = a[fastPointer];
            a[fastPointer] = currentVal;
            numSwaps++;
            if(a.length / d == 2 && numSwaps % 2 == 0){
                fastPointer += 1;
                nextVal = a[fastPointer];
            }
        }
        return a;
    }
    static int newIndex(int index, int numRotates, int arrayLength){
        int newIndex = index - numRotates;
        if(newIndex < 0) {
            newIndex = arrayLength + newIndex;
        } 
        return newIndex;
    }
}