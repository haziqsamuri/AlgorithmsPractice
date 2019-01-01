import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Advance {
    public static void main(String[] args) {
        //List<Integer> new_array = multiply(Arrays.asList(1,1 ), Arrays.asList(2,2 ));
        boolean result = canReachEnd(Arrays.asList(2,3,1,1,0,2,3 ));
        System.out.print(result);
    }

    public static boolean advance(int[] A) {
        // boolean flag = false;
        if (A[0] == 0) {
            return false;
        }
        return check(A, 1);
    }

    public static boolean check(int[] A, int index) {
        int val = A[index];
        System.out.printf("check call, index = %d \n", index);
        if (index >= 6) {
            System.out.printf("SOLUTION FOUND \n");
            return true;
        } else {
            System.out.printf("checking at index = %d \n", index);
            for (int i = 1; i <= val; i++) {
                System.out.printf("checking at i = %d, index = %d, A[i] = %d \n", i, index, A[i]);
                if (A[val + i] == 0) {
                    continue;
                } else {
                    check(A, index + i);
                }
            }
            System.out.printf("none found, index = %d \n", index);
            return false;
        }
        // return true;
    }

    public static boolean canReachEnd(List<Integer> maxAdvanceSteps) {
        int furthestReachSoFar = 0, lastlndex = maxAdvanceSteps.size() - 1;
        for (int i = 0; i <= furthestReachSoFar && furthestReachSoFar < lastlndex; ++i) {
            System.out.printf("checking at i = %d, furthest = %d, A[i] = %d \n", i, furthestReachSoFar,maxAdvanceSteps.get(i));
            furthestReachSoFar = Math.max(furthestReachSoFar, i + maxAdvanceSteps.get(i));
        }
        System.out.printf("final furthest = %d \n",furthestReachSoFar);
        return furthestReachSoFar >= lastlndex;
    }
}