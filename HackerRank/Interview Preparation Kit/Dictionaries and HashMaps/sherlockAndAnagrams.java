public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        char[] stringArray = s.toCharArray();
        int arrLen = stringArray.length, numAnagrams = 0;

        for (int len = 1; len < arrLen; len++) {
            for (int i = 0; i < arrLen - len; i++) {
                HashMap<Character, Integer> map = new HashMap<Character, Integer>();
                System.out.print("\n");
                for (int start = i; start < i + len; start++) {
                    System.out.print(stringArray[start]);
                    if (map.get(stringArray[start]) == null) {
                        map.put(stringArray[start], 1);
                    } else {
                        int val = map.get(stringArray[start]);
                        map.put(stringArray[start], ++val);
                    }
                }

            }
            //System.out.printf("\n len = %d", len);
            System.out.print("\n");
        }
        return numAnagrams;
    }

    public static boolean isAnagram(char[] string, int start, int end, HashMap<Character, Integer> map) {

        for (int i = start; i <= end; i++) {
            if (map.get(string[i]) == null || map.get(string[i]) == 0) {
                return false;
            } else {
                int val = map.get(string[i]);
                map.put(string[i], --val);
            }
        }

        return true;
    }
}