public class Solution{
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
}