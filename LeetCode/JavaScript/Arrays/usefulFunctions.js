
var array;
//array.splice( startElement, numToRemove);

var split = s.split("")
var reversed = split.reverse()
var answer = reversed.join("");

var associativeArray = {};
associativeArray["one"] = "First";
associativeArray["two"] = "Second";
associativeArray["three"] = "Third";
associativeArray["four"] = [0,0];
var four = 4;
console.log()
console.log(associativeArray[four.toString()]);

var num;
num.toString();

var maxDepth = function(root) {
    if(!root) return 0;
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
};