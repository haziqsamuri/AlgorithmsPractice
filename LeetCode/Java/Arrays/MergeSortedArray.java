class Solution {
    //Using three pointers, two at the longer array with 0's and 1 at the smaller array. 
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int onePointer = m - 1;
        int twoPointer = n - 1;
        int fullPointer = m + n - 1;
        while(twoPointer >= 0){
            if(onePointer == -1 || nums1[onePointer] < nums2[twoPointer]){
                nums1[fullPointer] = nums2[twoPointer];
                twoPointer--;
                fullPointer--;
            }
            else{
                nums1[fullPointer] = nums1[onePointer];
                onePointer--;
                fullPointer--;
            }
        }
    }
}