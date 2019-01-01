import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Advance {
    public static void main(String[] args) {
        // List<Integer> new_array = multiply(Arrays.asList(1,1 ), Arrays.asList(2,2 ));
        boolean result = canReachEnd(Arrays.asList(2, 3, 1, 1, 0, 2, 3));
        System.out.print(result);
    }

    public static int deleteDuplicates(List<Integer> A) {
        if (A.isEmpty()) {
            return 0;
        }
        int writeIndex = 1;
        for (int i = 1; i < A.size(); ++i) {
            if (!A.get(writeIndex - 1).equals(A.get(i))) {
                A.set(writeIndex++, A.get(i));
            }
        }
        return writeIndex;
    }
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int writeIndex = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[writeIndex - 1] != nums[i]) {
                nums[writeIndex++] = nums[i];
            }
        }
        return writeIndex;
    }
}