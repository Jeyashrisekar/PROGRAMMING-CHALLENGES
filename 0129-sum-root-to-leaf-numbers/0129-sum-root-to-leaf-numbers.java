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
    public int sumNumbers(TreeNode root) {
        int c = sum(root, 0);
        return c;
        
    }
    public int sum(TreeNode root, int d){
        if(root == null) return 0;
         d = d * 10 + root.val;
        if(root.left == null && root.right == null) return d; 
        int l = sum(root.left, d);
        int r = sum(root.right, d);
        
        return r + l;
    }
}