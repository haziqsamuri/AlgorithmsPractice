public class Solution{
    //O(n) using slopes
    static long arrayManipulation(int n, int[][] queries) {
        //System.out.printf("n = %d\n, first = %d\n", n, queries[0][0]);
        long[] arr = new long[n];
        for(int i = 0; i < queries.length; i++){
            arr[queries[i][0] - 1] += queries[i][2];
            if(queries[i][1] < n){
                arr[queries[i][1]] -= queries[i][2];
            }
            
        }
        //System.out.printf(Arrays.toString(arr));
        long maxNum = arr[0];
        long currentNum = arr[0];
        for(int j = 1; j < arr.length; j++){
            currentNum += arr[j];
            if(currentNum > maxNum){
                maxNum = currentNum;
            }
        }

        return maxNum;

    }
    // Original solution - timeout
    static long arrayManipulation2(int n, int[][] queries) {
        //System.out.printf("n = %d\n, first = %d\n", n, queries[0][0]);
        long[] arr = new long[n];
        long maxNum = 0;
        for(int i = 0; i < queries.length; i++){
            for(int j = queries[i][0] - 1; j < queries[i][1]; j++){
                    arr[j] += queries[i][2];
                    if(arr[j] > maxNum){
                        maxNum = arr[j];
                    }
                
            }
        }
        return maxNum;

    }
}