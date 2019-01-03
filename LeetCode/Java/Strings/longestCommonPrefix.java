class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        
        char[] prefix = strs[0].toCharArray();
        int lastChar = prefix.length;
        int smallestLength = strs[0].length();
        for(int i = 1; i < strs.length; i++){
            if(strs[i].length() < smallestLength){
                smallestLength = strs[i].length();
            }
            for(int j = 0; j < prefix.length && j < strs[i].length(); j++){
                if(prefix[j] == 0){
                    break;
                }
                if(prefix[j] != strs[i].charAt(j)){
                    prefix[j] = 0;
                    lastChar = j;
                    break;
                }
            }
        }
        if(smallestLength < lastChar){
            lastChar = smallestLength;
        }
        return String.valueOf(Arrays.copyOf(prefix, lastChar));
    }
}