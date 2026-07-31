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
    
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return addRow(root, 1, val, depth);

    }
     public TreeNode addRow(TreeNode root, int curdep, int val, int depth){
    if(root == null) return null;
        if(depth == 1){
            TreeNode n = new TreeNode(val);
            n.left = root;
            return n;
        }
        else if(curdep == depth - 1){
            TreeNode a = new TreeNode(val);
            TreeNode b = new TreeNode(val);
            
            TreeNode oldleft = root.left;
            TreeNode oldright = root.right;
            root.left = a;
            root.right = b;
            a.left = oldleft;
            b.right = oldright;
            return root;
        }
        
        
        addRow(root.left, curdep +1, val, depth);
        addRow(root.right,curdep +1 , val, depth);
        return root;
     }
}