//beat 100%
var moveZeroes = function(nums) {
    var num_spliced = 0;
    for(var i = 0; i< nums.length; i++){      
        if(nums[i]==0){
            nums.splice(i,1);  
            num_spliced++;
            i--;
        }
    }
    for(var j = 0; j < num_spliced; j++){
        nums.push(0);   
    }
};