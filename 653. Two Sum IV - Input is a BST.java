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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        helper(root, li); 

        for(int i=0; i<li.size(); i++){
             for(int j=0; j<li.size(); j++){
                 if((i!=j) && (li.get(i)+li.get(j) == k)){
                     return true;
                 }
            }
        }
        return false;
    }

    void helper(TreeNode root, ArrayList<Integer> li){
        if(root==null)
            return;
        li.add(root.val);
        helper(root.left, li);
        helper(root.right, li);

    }

}


//----------------------------------------  Another Approach ----------------------------------------

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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        helper(root, li); 
        
        int i=0, j=li.size()-1;

        while(i<j){
            int sum = li.get(i)+li.get(j);
            if(sum==k)
                return true;   
            else if(sum<k)
                i++;
            else
                j--;    
        }
        return false;
    }

    void helper(TreeNode root, ArrayList<Integer> li){
        if(root==null)
            return;
        helper(root.left, li);
        li.add(root.val);
        helper(root.right, li);

    }

}

