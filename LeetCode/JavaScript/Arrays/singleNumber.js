const singleNumber = nums => {
    //let i = 0;
    console.log("length = "+nums.length);
    for(i=1;i<nums.length;i++){
        
    console.log(nums[i]);
    console.log("nums i - 1 = " + nums[i-1]);
        nums[i]^=nums[i-1]
        console.log("nums i = " + nums[i]);
    }
    console.log(nums[nums.length-1]);
    return nums[nums.length-1];
    // while (++i < nums.length) {
    //     console.log("nums i = " + nums[i]);
        
    //     console.log("nums i - 1 = " + nums[i-1]);
    //     nums[i] = nums[i]^nums[i-1]
    //     console.log("i = " + i);
    // console.log(nums[i]);
    // }
    // return nums[nums.length-1]
}