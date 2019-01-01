public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int numPairs = 0;
        Map<Integer, Integer> table = new HashMap<Integer, Integer>();
        for(int i = 0; i < ar.length; i++){
            if(table.get(ar[i]) == null){
                table.put(ar[i], 1);
            }
            else{
                int val = table.get(ar[i]);
                table.put(ar[i], ++val);
            }
        }
        for(int key : table.keySet()){
            numPairs += (table.get(key) / 2);
        }
        return numPairs;
    }
}