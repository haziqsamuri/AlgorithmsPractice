public class Solution {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int min = a[0];
        int max = a[0];
        int numSwapsNeeded = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    numSwapsNeeded++;
                }
                if (a[j] < min) {
                    min = a[j];
                } else if (a[j] > max) {
                    max = a[j];
                }

            }
        }
        System.out.printf("Array is sorted in %d swaps.\n", numSwapsNeeded);
        System.out.printf("First Element: %d\n", min);
        System.out.printf("Last Element: %d\n", max);

    }
}