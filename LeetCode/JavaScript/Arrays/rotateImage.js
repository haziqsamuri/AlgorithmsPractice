var rotate = function(matrix) {
    var matrix_copy = [];

    for (var i = 0; i < matrix.length; i++)
    matrix_copy[i] = matrix[i].slice();
    
    var len = matrix.length;
    var n = len - 1;
    
    for(var i = 0; i < len; i++){
        for(var j = 0; j < len; j++){
            matrix[j][n] = matrix_copy[i][j];
        }
        n--
    }
};