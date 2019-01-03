class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1, end = -1;
        int mid;
        int lo1 = 0, hi1 = nums.length;
        int lo2 = 0, hi2 = nums.length;
        int lowBound, highBound;
        while (lo1 < hi1) {
            mid = (hi1 - lo1) / 2 + lo1;
            if (nums[mid] >= target) {
                hi1 = mid;
            } else {
                lo1 = mid + 1;
            }
        }
        lowBound = lo1;
        while (lo2 < hi2) {
            mid = (hi2 - lo2) / 2 + lo2;
            if (nums[mid] > target) {
                hi2 = mid;
            } else {
                lo2 = mid + 1;
            }
        }
        highBound = lo2 - 1;
        int[] ans = { start, end };
        if (nums[lowBound] == target) {

            ans[0] = lowBound;
            ans[1] = highBound;

        }
        
        return ans;
    }
}

// public int[] searchRange(int[] nums, int target) {
// int start = -1, end = -1;
// int halfPoint = (nums.length - 1) / 2;
// int lowerBound = 0, upperBound = nums.length - 1;
// //int numSplits = 0, maxSplits = nums.length / 2;
// while(nums[halfPoint] != target){
// if(lowerBound == upperBound){
// break;
// }
// if(nums[halfPoint] < target){
// lowerBound = halfPoint;
// }
// else{
// upperBound = halfPoint;
// }
// halfPoint = (upperBound - lowerBound) / 2 + halfPoint;
// //numSplits++;
// }
// if(nums[halfPoint] == target){
// for(int i = halfPoint; i >= 0; i--){
// if(nums[i] == target){
// start = i;
// }
// else{
// break;
// }
// }
// for(int i = halfPoint; i < nums.length; i++){
// if(nums[i] == target){
// end = i;
// }
// else{
// break;
// }
// }
// }

// int[] ans = {start, end};
// return ans;
// }