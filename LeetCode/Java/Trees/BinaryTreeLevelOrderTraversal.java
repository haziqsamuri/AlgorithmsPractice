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
    // O(n) time using Queue.
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> subList = new ArrayList<Integer>();
            int numAtLevel = q.size();
            for(int i = 0; i < numAtLevel; i++){
                TreeNode node = q.poll();
                if(node == null){
                    continue;
                }
                subList.add(node.val);
                q.add(node.left);
                q.add(node.right);
            }
            if(!subList.isEmpty()){
                list.add(subList);
            }
        }
        return list;
    }
}