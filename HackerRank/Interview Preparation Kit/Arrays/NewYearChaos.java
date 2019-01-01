public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        boolean isPossible = true;
        int smallestPointer, secondSmallestPointer;
        int numBribes = 0;
        if(q[q.length - 1] < q[q.length - 2]){
            smallestPointer = q.length - 1;
            secondSmallestPointer = q.length - 2;
            numBribes++;
        }
        else{
            smallestPointer = q.length - 2;
            secondSmallestPointer = q.length - 1;
        }
        for(int i = q.length - 3; i >= 0; i--){
            if(q[i] -  (i + 1) > 2){
                isPossible = false;
                break;
            }
            if(q[i] > q[smallestPointer]){
                if(q[i] > q[secondSmallestPointer] && secondSmallestPointer != smallestPointer){
                    numBribes += 2;
                }
                else{
                    numBribes ++;
                }
            }
            if(q[i] < q[smallestPointer]){
                secondSmallestPointer = smallestPointer;
                smallestPointer = i;
            }
            else if(q[i] < q[secondSmallestPointer]){
                secondSmallestPointer = i;
            }
        }
        if(!isPossible){
            System.out.print("Too chaotic\n");
        }
        else{
            System.out.printf("%d\n", numBribes);

        }

    }
}