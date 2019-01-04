/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0, end = nums.length - 1;
        return createBST(nums, start, end);
        
    }
    
    public TreeNode createBST(int[] array, int start, int end){
        if(start > end){
            return null;
        }
        
        int mid = (end-start) / 2 + start;
        
        TreeNode root = new TreeNode(array[mid]);
        
        root.left = createBST(array, start, mid - 1);
        root.right = createBST(array, mid + 1, end);
        return root;
    }
}