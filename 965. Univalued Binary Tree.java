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
    ArrayList<Integer> li = new ArrayList<>();
    public boolean isUnivalTree(TreeNode root) {
        helper(root);

        for(int i : li){
            if(li.get(0) != i)
                return false;
        }    
        return true;

    }

    void helper(TreeNode root){
        if(root==null) return;
        li.add(root.val);
        helper(root.left);
        helper(root.right);
 
    }
}
