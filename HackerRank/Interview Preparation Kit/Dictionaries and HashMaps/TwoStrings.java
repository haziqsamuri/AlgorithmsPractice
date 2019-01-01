
public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        HashSet<Character> dict = new HashSet<Character>();
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        for(char c : s1Array){
            dict.add(c);
        }
        for(char c2 : s2Array){
            if(dict.contains(c2)){
                return "YES";
            }
        }
        return "NO";
    }
}