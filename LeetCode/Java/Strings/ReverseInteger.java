class Solution {
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