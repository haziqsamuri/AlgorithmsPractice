class Solution {
    public void nextPermutation(int[] nums) {
        boolean done = false;
        if(nums.length > 1){
            int fastPointer = nums.length - 1, toSwap; slowPointer = nums.length - 1;
            for(int i = fastPointer; i > 0; i--){
                if(nums[fastPointer - 1] < nums[fastPointer]){
                    toSwap = nums[fastPointer - 1];
                    while(nums[slowPointer] < toSwap){
                        slowPointer--;
                    }
                    if(slowPointer == fastPointer){
                        int tmp = nums[fastPointer];
                        nums[fastPointer] = nums[fastPointer-1];
                        nums[fastPointer-1] = tmp;
                        done = true;
                        break;
                    }

                }
                
                // if(nums[i] < nums[i+1]){
                //     int tmp = nums[i];
                //     nums[i] = nums[i+1];
                //     nums[i+1] = tmp;
                //     done = true;
                //     break;
                // }
            }
        }
        if(!done){
            int startPointer = 0, endPointer = nums.length -1;
            while(startPointer < endPointer){
                int tmp = nums[startPointer];
                nums[startPointer] = nums[endPointer];
                nums[endPointer] = tmp;
                startPointer++;
                endPointer--;
            }
        }
    }
}