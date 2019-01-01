var threeSum = function(nums) {
    var solnArray = new Array();
    var elem = 0;

    for(var i = 0; i < nums.length-2; i++){
        for(var j = i+1; j < nums.length-1; j++){
            for(var k = j+1; k < nums.length; k++){
                //console.log(`i = ${nums[i]}  j = ${nums[j]} k = ${nums[k]}`);
                if(nums[i] + nums[j] + nums[k] === 0){
                    solnArray[elem] = [nums[i], nums[j], nums[k]];
                    //console.log(solnArray);
                    elem++;
                }
            }
        }
    }
    
    return solnArray;
    
};

console.log(threeSum([-1,0,1,2,-1,-4]));