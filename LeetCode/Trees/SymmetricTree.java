// Working recursive solution
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    public boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        return (left.val == right.val && isMirror(left.left, right.right) && isMirror(left.right, right.left));
    }
}

// Working iterative solution
class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        q.add(root);
        while(!q.isEmpty()){
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if(t1 == null && t2 == null){
                continue;
            }
            else if(t1 == null || t2 == null){
                return false;
            }
            if(t1.val != t2.val){
                return false;
            }
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }

}

// Not working, fails some test cases
class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null || root.right == null && root.left == null){
            return true;
        }
        if(root.left == null || root.right == null){
            return false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        addToStack(root.left, stack);
        return checkSymmetrical(root.right, stack);
        
    }
    public void addToStack(TreeNode root, Stack<Integer> stack){
        if(root.left != null){
            addToStack(root.left, stack);
        }
        stack.push(root.val);
        if(root.right != null){
            addToStack(root.right, stack);
        }
    }
    public boolean checkSymmetrical(TreeNode root, Stack<Integer> stack){
        if(stack.isEmpty()){
            return false;
        }
        if(root.left != null){
            checkSymmetrical(root.left, stack);
        }
        else if(root.val != stack.pop()){
            return false;
        }
        if(root.right != null){
            checkSymmetrical(root.right, stack);
        }
        return true;
    }
}