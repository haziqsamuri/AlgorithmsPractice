var rotate = function(nums, k) {
    var len = nums.length;
    var new_array = nums.slice();
    if(k>len){
        k = k%len;
    }
    for(i=0;i<len;i++){
        if(i+k > len-1){
            nums[i+k-len] = new_array[i];
        }
        else{
            nums[i+k]=new_array[i];
        }
    }
};