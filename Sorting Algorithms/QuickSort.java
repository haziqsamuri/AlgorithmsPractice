import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuickSort{

    public static void quickSort(int[] array){
        quickSort(array, 0, array.length - 1);
    }
    public static void quickSort(int[] array, int left, int right){

        if(left >= right){
            return;
        }
        int pivot = array[left + (right - left) / 2];
        int index = partition(array, left, right, pivot);
        quickSort(array, left, index - 1);
        quickSort(array, index, right);
    }
    public static int partition(int[] array, int left, int right, int pivot){
        while(left <= right){
            while(array[left] < pivot){
                left++;
            }
            while(array[right] > pivot){
                right--;
            }
            if(left <= right){
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }
    public static void swap(int[] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public static void main(String args[]) 
    { 
        int arr[] = {10, 7, 8, 9, 1, 5, 22, 213213213,34,2133,123,5423,564,54,132,123,547,765,35467,546,465, 0, 23, -1, -231232, -432,-432123213, 0,0,0,0,1,1,1,1,1}; 
        //int n = arr.length; 
  
        quickSort(arr);
  
        System.out.println("sorted array"); 
        System.out.println(Arrays.toString(arr));
        
    } 
}