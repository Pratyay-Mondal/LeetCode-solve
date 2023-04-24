/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null) 
            return true;
            
        Stack<TreeNode> stk = new Stack<>();
        TreeNode pre = null;

        while(root != null || !stk.isEmpty()){
            while(root != null){
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            if(pre != null && pre.val >= root.val){
                return false;
            }
            pre = root;
            root = root.right;

        }
        
        return true;
    }
}

