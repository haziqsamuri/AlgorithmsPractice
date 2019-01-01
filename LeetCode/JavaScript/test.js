//assume emails kept in an array

var validEmail = function(emails){
    var validEmails = [];
    //reg used to validate emails (found online)
    var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
    console.log(emails[0])
    for(var i = 0; i<emails.length; i++){
        console.log(emails[i])
        if(reg.test(emails[i]) == true){
            validEmails.push(emails[i]);
        }
    }
    return validEmails;
}


var associativeArray = {};
associativeArray["one"] = "First";
associativeArray["two"] = "Second";
associativeArray["three"] = "Third";
associativeArray["4"] = [0,0];
associativeArray["-4"] = [4,0];
var four = 4;
var negFour = -4;
console.log(associativeArray[four.toString()]);