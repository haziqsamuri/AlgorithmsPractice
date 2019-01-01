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