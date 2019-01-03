class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        
        while(start < end){
            if(!Character.isDigit(s.charAt(start)) && !Character.isLetter(s.charAt(start))){
                start++;
            }
            else if(!Character.isDigit(s.charAt(end)) && !Character.isLetter(s.charAt(end))){
                end--;
            }
            else if(Character.toLowerCase(s.charAt(start++)) != Character.toLowerCase(s.charAt(end--))){
                return false;
            }
        }
        return true;
    }
}