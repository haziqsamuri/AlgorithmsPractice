var intersect = function(nums1, nums2) {
    var table = []
    var final = []
    for(var i = 0; i< nums1.length; i++){
        if(table[nums1[i]] == undefined){
            console.log(table[nums1[i]])
            table[nums1[i]] = [1,0]
            console.log(table[nums1[i]][0])
        }
        else{
            table[nums1[i]][0] += 1;
            console.log(table[nums1[i]][0]);
        }
    }
    for(var j = 0; j< nums2.length; j++){
        if(table[nums2[j]] != undefined){
            table[nums2[j]][1] += 1;
        }
    }
    for(var k = 0; k < table.length; k++){
        if(table[k] != undefined){
            var repetitions = Math.min(table[k][0],table[k][1])
            if(repetitions> 0){
                for(var l = 1; l<= repetitions; l++){
                    final.push(k);
                }
            }
        }
    }
    console.log(table);
    console.log(final)
    return final;
};
console.log(intersect([1],[1]));

[".",".","5",".",".",".",".",".","6"],
[".",".",".",".","1","4",".",".","."],
[".",".",".",".",".",".",".",".","."],
[".",".",".",".",".","9","2",".","."],
["5",".",".",".",".","2",".",".","."],
[".",".",".",".",".",".",".","3","."],
[".",".",".","5","4",".",".",".","."],
["3",".",".",".",".",".","4","2","."],
[".",".",".","2","7",".","6",".","."]