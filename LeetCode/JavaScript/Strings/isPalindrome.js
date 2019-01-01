/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
  var str = x.toString();
  len = str.length;
  var half = len / 2;
  if (x < 0) {
    return false;
  } else {
    var j = len - 1;
    for (var i = 0; i < half; i++) {
      if (str[i] != str[j]) {
        return false;
      }
      j--;
    }
    return true;
  }
};

var isPalindromeNoString = function(x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
      }
    
      var reversedNum = 0;
      while(x > reversedNum){
          reversedNum =  reversedNum* 10 + x % 10 ;
          x /= 10;
          x = Math.floor(x);
      }
      if( x === reversedNum || x === Math.floor(reversedNum / 10)){
          return true;
    
      }
      else{return false}
};