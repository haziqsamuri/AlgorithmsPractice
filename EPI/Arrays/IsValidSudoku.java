import java.util.Arrays;
import java.util.List;
public class IsValidSudoku{
    public static void main(String[] args){
        System.out.println("9" == "9");
    }
    public static boolean isValidSudoku(List<List<Integer>> A){
        for(int i = 0; i < A.size(); i++){
            for(int j = 0; j < A.size(); j++){
                if()
                if(!checkRowCol(i, j, A) || !checkSubGrid(i, j, A)) {
                    return false;
                }
            } 
        }
        return true;
    } 
    public static boolean checkRowCol(int row, int col, List<List<Integer>> A){
        for(int i = 0; i < A.size(); i++){
             if(A.get(i).get(col) == A.get(row).get(col)){
                 return false;
             }
        }
        for(int j = 0; j < A.size(); j++){
            if(A.get(row).get(j) == A.get(row).get(col)){
                return false;
            }
        }
        return true;
    }
    public static boolean checkSubGrid(int row, int col, List<List<Integer>> A){
        int lowerRow, upperRow, lowerCol, upperCol;
        if((row+1) % 3 == 0){
            upperRow = row;
            lowerRow = row - 2;
        }
        else if((row+1) % 2 == 0){
            upperRow = row + 1;
            lowerRow = row - 1;
        }
        else{
            upperRow = row + 2;
            lowerRow = row;
        }
        if((col+1) % 3 == 0){
            upperCol = col;
            lowerCol = col - 2;
        }
        else if((col+1) % 2 == 0){
            upperCol = col + 1;
            lowerCol = col - 1;
        }
        else{
            upperCol = col + 2;
            lowerCol = col;
        }
        for(int i = lowerRow; i <= upperRow; i++){
            for(int j = lowerCol; j <= upperCol; j++){
                if(A.get(i).get(j) == A.get(row).get(col)) {
                    return false;
                }
            } 
        }
        return true;
    }
}


// public static boolean isValidSudoku(char[][] A){
//     for(int i = 0; i < A.length; i++){
//         for(int j = 0; j < A.length; j++){
//             if(A[i][j] != '.' && (!checkRowCol(i, j, A) || !checkSubGrid(i, j, A))) {
//                 return false;
//             }
//         } 
//     }
//         return true;
// } 
// public static boolean checkRowCol(int row, int col, char[][] A){
//     for(int i = 0; i < A.length; i++){
//          if(i != row && A[i][col] == A[row][col]){
//              return false;
//          }
//     }
//     for(int j = 0; j < A.length; j++){
//         if(j != col && A[row][j] == A[row][col]){
//             return false;
//         }
//     }
//     return true;
// }
// public static boolean checkSubGrid(int row, int col, char[][] A){
//     int lowerRow, upperRow, lowerCol, upperCol;
//     if(row == 2 || row == 5 || row == 8){
//         upperRow = row;
//         lowerRow = row - 2;
//     }
//     else if(row == 1 || row == 4 || row == 7){
//         upperRow = row + 1;
//         lowerRow = row - 1;
//     }
//     else{
//         upperRow = row + 2;
//         lowerRow = row;
//     }
//     if(col == 2 || col == 5 || col == 8){
//         upperCol = col;
//         lowerCol = col - 2;
//     }
//     else if(col == 1 || col == 4 || col == 7){
//         upperCol = col + 1;
//         lowerCol = col - 1;
//     }
//     else{
//         upperCol = col + 2;
//         lowerCol = col;
//     }
//     for(int i = lowerRow; i <= upperRow; i++){
//         for(int j = lowerCol; j <= upperCol; j++){
//             if(i != row && j != col && A[i][j] == A[row][col]) {
//                 return false;
//             }
//         } 
//     }
//     return true;
// }