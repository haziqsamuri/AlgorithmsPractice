class Solution {
    public void moveZeroes(int[] nums) {
        int fast = 1;
        int slow = 0;
        int tmp;
        while(fast < nums.length){
            if(fast == slow){
                fast++;
            }
            if(nums[fast] == 0){
                fast++;
            }
            else if(nums[slow] != 0){
                slow++;
            }
            else{
                tmp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = tmp;
            }
        }
    }
}