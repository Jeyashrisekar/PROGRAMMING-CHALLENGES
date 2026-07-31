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
    public boolean isCompleteTree(TreeNode root) {
        int tn = countnodes(root);
        return complete(0, root, tn);
    }
    public int countnodes(TreeNode root){
        if(root == null) return 0;
        int l = countnodes(root.left);
        int r = countnodes(root.right);
        return l+r+1;
    }
    public boolean complete(int i , TreeNode root, int tn){
        if(root == null) return true;
        if(i >= tn) return false;
        boolean l = complete(2 * i +1, root.left, tn);
        boolean r = complete(2 * i+2, root.right, tn);
        return l && r;
    }
}