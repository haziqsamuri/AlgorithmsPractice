class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }
        
        int maxLoot = nums[0] + nums[2] > nums[1] ? nums[0] + nums[2] : nums[1];
        nums[2] = maxLoot;
        
        for(int i = 3; i < nums.length; i++){
            nums[i] += nums[i-3] > nums[i-2] ? nums[i-3] : nums[i-2];
            maxLoot = nums[i] > maxLoot ? nums[i] : maxLoot;
        }
        
        return maxLoot;
    }
}