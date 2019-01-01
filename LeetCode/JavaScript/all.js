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
var rotate = function(nums, k) {
    var len = nums.length;
    var new_array = nums.slice();
    if(k>len){
        k = k%len;
    }
    for(i=0;i<len;i++){
        if((i+k > len-1)){
            nums[i+k-len] = new_array[i];
        }
        else if(i+k <= len){
            nums[i+k]=new_array[i];
        }
    }
   // console.log(new_array);
    //nums = new_array.slice();
    
   console.log(nums);
    //return new_array;
};

var intersect = function(nums1, nums2) {
    var number = []
    for(i=0;i<nums1.length;i++){
        for(j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
                number.push(nums1[i]);
                nums1.splice(i,1);
                nums2.splice(j,1);
                i--;
                j--;
            }
        }
    }
    return number;
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

//Start of Strings

var reverseString = function(s) {
    var split = s.split("")
    var reversed = split.reverse()
    var answer = reversed.join("");
    return answer;
};

var firstUniqChar = function(s) {
    var split = s.split("");
    for(i=0;i<s.length;i++){
        for(j=0;j<s.length;j++){
            if(s[i]==s[j] && i!=j){
                break; 
            }
            else if(j==s.length-1){
                return i;
            }
        }
    }
    return -1;
};

var myAtoi = function(str) {
    var trimmed = str.trim();
    var string = trimmed.split("");
    var num_string = [];
    var joined_num = [];
    var count = 0;
    var num;
    
    if(string[0]!="-" && string[0]!="+" && !Number.isInteger(parseInt(string[0]))){
            return 0;
        }
    if(string[0] == "-"){
        if(!Number.isInteger(parseInt(string[1]))){
            return 0;
        }
        num_string.push("-");
        count++;
    }
     if(string[0] == "+"){
        if(!Number.isInteger(parseInt(string[1]))){
            return 0;
        }
        //num_string.push("-");
        count++;
    }
    for(count;count<string.length;count++){
        if(Number.isInteger(parseInt(string[count]))){
            num_string.push(string[count]);
        }
        else{
            break;
        }
    }
    joined_num = num_string.join("");
    num = parseInt(joined_num);
    if(num > 2147483647){
        return 2147483647;
    }
    else if(num < -2147483648){
        return -2147483648;
    }
    else return num;
};
var isAnagram = function(s, t) {
    if(s.length >= t.length){  
        var str1 = s.split("");
        var str2 = t.split("");
    }
    else {
        var str1 = t.split("");
        var str2 = s.split("");
    }
    console.log(t + " " + s)
    for(i=0;i<str1.length;i++){
        if(str2[0] == null){
                return false;
            }
        for(j=0;j<str2.length;j++){
            if(str1[i] == str2[j]){
                str1.splice(i,1);
                str2.splice(j,1);
                i--;
                j--;
                break;
            }
            
            else if(j == str2.length - 1){
                return false;
            }
        }
    }
    return true;
};

