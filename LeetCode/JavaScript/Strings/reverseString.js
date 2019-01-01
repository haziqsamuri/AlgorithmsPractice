var reverseString = function(s) {
    var split = s.split("")
    var reversed = split.reverse()
    var answer = reversed.join("");
    return answer;
};