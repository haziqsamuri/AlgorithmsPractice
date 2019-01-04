class Solution {
    class Solution {
        public int reverse(int x) {
            int rem = x;
            int rev = 0;
            boolean neg = false;
            if(x < 0){
                neg = true;
                rem *= -1;
            }
            while(rem > 0){
                if(rev > Integer.MAX_VALUE / 10){
                    return 0;
                }
                rev *= 10;
                rev += rem%10;
                rem /= 10;
            }
            if(neg){
                rev *= -1;
            }
            return rev;
        }
    }

    // Original, TRAP QUESTION, dont convert to different primitive type.
    public int reverse(int x) {
        String str = Integer.toString(x);
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        char tmp;
        if(arr[0] == '-'){
            start++;
        }
        while(start < end){
            tmp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = tmp;
        }
        return Integer.valueOf(String.valueOf(arr));
    }
}