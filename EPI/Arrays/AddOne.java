import java.util.Arrays;
public class AddOne{
    public static void main(String[] args){
        int[] new_array = plusOne(new int[] {9,9,9,0});
        System.out.print(Arrays.toString(new_array));
    }
    public static int[] plusOne(int[] A){
        int n = A.length - 1;
        for(int i = n; i>=0; i--){
            if(A[i] < 9){
                A[i] += 1;
                return A;
            }
            else{
                A[i] = 0;
            }
        }
        int[] arr = new int[A.length + 1];
        arr[0] = 1;
        for(int i = 1; i < arr.length; i++){
            arr[i] = 0;
        }
        return arr;
    } 
    //Int[] array = plusOne([1]);
}