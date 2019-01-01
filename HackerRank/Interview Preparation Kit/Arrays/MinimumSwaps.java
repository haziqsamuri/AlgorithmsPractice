
public class Solution {
    static int minimumSwaps(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int numSwaps = 0;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i + 1);
        }
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j + 1){
                int index = map.get(j + 1);
                int swapIndex = map.get(arr[j]);
                
                map.put(arr[j], index);
                map.put(j + 1, swapIndex);
                
                arr[index - 1] = arr[j];
                arr[j] = j + 1;

            
                numSwaps++;
            }
        }
        return numSwaps;
        

    }
}