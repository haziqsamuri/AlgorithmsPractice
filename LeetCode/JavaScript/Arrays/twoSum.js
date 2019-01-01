// Using Hash Table - Beats 100%

var twoSum = function(nums, target) {
    var table = {}
    
    for(var i = 0; i<nums.length; i++){
        var difference = target-nums[i];
        if(table[difference] >= 0){
            return [i, table[difference]]
        }
        table[nums[i]] = i; 
    }
};

var twoSum = function(nums, target) {
    var number = [];
    for(i=0;i<nums.length;i++){
        for(j=0;j<nums.length;j++){
            if(nums[i] + nums[j] == target && i != j){
                number.push(i);
                number.push(j);
                return number;
            }
        }
    }
};

// C# Solution

// public class Solution {
//     public int[] TwoSum(int[] nums, int target) {
//         for(int i = 0; i < nums.Length; i++){
//             for(int j = 1; j < nums.Length; j++){
//             if(nums[i]+nums[j] == target && i != j){
//                 int[] ans = {i,j};
//                 return ans;
//             }
//         }
//         }
//         return new int[0];
//     }
// }