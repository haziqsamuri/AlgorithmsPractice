/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    var elem = 0;
    while(elem < nums.length){    
        while(nums[elem] == nums[elem+1] && elem+1 < nums.length) {
            nums.splice(elem+1, 1);
        }
        elem++;
    }
    return nums.length;
};


console.log(removeDuplicates([1,1,1,11,0]));