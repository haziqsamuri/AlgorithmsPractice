public class Solution {

    // O(n^2) solution
    static long countTripletsSlow(List<Long> arr, long r) {
        HashMap<Long, List<Long>> map = new HashMap<Long, List<Long>>();
        long numTriplets = 0;
        for (int i = 2; i < arr.size(); i++) {
            if (!map.containsKey(arr.get(i))) {
                List<Long> list = new ArrayList<Long>();
                Long iLong = Long.valueOf(i);
                list.add(iLong);
                map.put(arr.get(i), list);
            } else {
                List<Long> list = map.get(arr.get(i));
                Long iLong = Long.valueOf(i);
                list.add(iLong);
                map.put(arr.get(i), list);
            }
        }
        for (int j = 0; j < arr.size() - 2; j++) {
            for (int k = j+1; k < arr.size() - 1; k++) {
                if(arr.get(k) != arr.get(j) * r){
                    continue;
                }
                if (map.containsKey(arr.get(k) * r)) {
                    List<Long> list = map.get(arr.get(k) * r);
                    for (int index = 0; index < list.size(); index++) {
                        if (list.get(index) > k) {
                            numTriplets++;
                        }
                    }
                }
            }
        }
        return numTriplets;
    }

    // O(n) solution using 2 HashMaps to keep track of first and second value.
    static long countTriplets(List<Long> arr, long r) {
        HashMap<Long, Long> secondVal = new HashMap<Long, Long>();
        HashMap<Long, Long> thirdVal = new HashMap<Long, Long>();
        Long numTriplets = 0L;

        for(Long a : arr){
            numTriplets += thirdVal.getOrDefault(a, 0L);
            if(secondVal.containsKey(a)){
                thirdVal.put(a*r, thirdVal.getOrDefault(a*r, 0L) + secondVal.get(a));
            }
            secondVal.put(a*r, secondVal.getOrDefault(a*r, 0L) + 1);
        }
        return numTriplets;

    }
}