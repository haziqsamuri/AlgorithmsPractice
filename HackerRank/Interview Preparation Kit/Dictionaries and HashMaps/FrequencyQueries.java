public class Solution{
    // O(n) solution using 2 Hashmaps for the map of array and for frequencies. Use different boilerplate on HackerRank discussion for this solution to pass.
    static List<Integer> freqQuery(int[][] queries) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < queries.length; i++){
            if(queries[i][0] == 1){
                map.put(queries[i][1], map.getOrDefault(queries[i][1], 0) + 1);
                freq.put(map.get(queries[i][1]), freq.getOrDefault(map.get(queries[i][1]), 0) + 1);
                freq.put(map.get(queries[i][1]) - 1, freq.getOrDefault(map.get(queries[i][1]) - 1, 0) - 1);
            }
            else if(queries[i][0] == 2){
                if(map.containsKey(queries[i][1])){
                    freq.put(map.get(queries[i][1]) - 1, freq.getOrDefault(map.get(queries[i][1]) - 1, 0) + 1);
                    freq.put(map.get(queries[i][1]), freq.getOrDefault(map.get(queries[i][1]), 0) - 1);
                    if(map.get(queries[i][1]) == 1){
                        map.remove(queries[i][1]);
                    }
                    else{
                        map.put(queries[i][1], map.get(queries[i][1]) -1 );
                    }
                    
                }
            }
            else{
                if (freq.containsKey(queries[i][1]) && freq.get(queries[i][1]) > 0) {
                    result.add(1);
                } else {
                    result.add(0);
                }
            }
        }
        return result;
    }
}

public class Solution{
    static List<Integer> freqQuery(List<int[]> queries) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < queries.size(); i++){
            if(queries.get(i)[0] == 1){
                map.put(queries.get(i)[1], map.getOrDefault(queries.get(i)[1], 0) + 1);
            }
            else if(queries.get(i)[0] == 2){
                if(map.containsKey(queries.get(i)[1])){
                    if(map.get(queries.get(i)[1]) == 1){
                        map.remove(queries.get(i)[1]);
                    }
                    else{
                        map.put(queries.get(i)[1], map.get(queries.get(i)[1]) -1 );
                    }
                }
            }
            else{
                if(map.containsValue(queries.get(i)[1])){
                    result.add(1);
                }
                else{
                    result.add(0);
                }

            }
        }
        return result;
    }
}