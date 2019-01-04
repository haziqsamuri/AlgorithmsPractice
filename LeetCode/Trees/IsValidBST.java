// O(n) Solution by copying to a list O(n) space though
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        List<Integer> list = new ArrayList<Integer>();
        checkInOrderTraversal(root, list);
        for(int i = 0; i < list.size() - 1; i++){
            int j = i + 1;
            if(list.get(i) >= list.get(j)){
                return false;
            }
            j++;
        }
        return true;
    }
    public void checkInOrderTraversal(TreeNode node, List<Integer> list){
        if(node != null){
            
             checkInOrderTraversal(node.left, list);
             list.add(node.val);
             checkInOrderTraversal(node.right, list);
        }
        
    }
}

//Can be fixed using global variable to compare min n max and end up using O(1) space
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        return checkInOrderTraversal(root);
    }
    public boolean checkInOrderTraversal(TreeNode node){
        if(node == null){
            return true;
        }
        if(node.left != null){
            if(node.left.val >= node.val){
                return false;
            }
        }
        if(node.right != null){
            if(node.right.val <= node.val){
                return false;
            }
        }
        else{
            checkInOrderTraversal(node.left);
            checkInOrderTraversal(node.right);
        }
        return true;
    }
}