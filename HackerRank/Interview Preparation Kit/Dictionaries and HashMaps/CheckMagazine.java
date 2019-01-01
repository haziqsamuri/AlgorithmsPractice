import java.util.HashMap;

public class Solution{
    static void checkMagazine(String[] magazine, String[] note){
        HashMap<String,Integer> map = new HashMap<String, Integer>();

        for(String s : magazine){
            if(!map.containsKey(s)){
                map.put(s,1);
            }
            else{
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        for(String s2 : note){
            if(!map.containsKey(s2) || map.get(s2) == 0){
                System.out.println("No");
                return;
            }
            else{
                map.put(s2, map.getOrDefault(s2, 0) - 1);
            }
        }
        System.out.println("Yes");
    }
}