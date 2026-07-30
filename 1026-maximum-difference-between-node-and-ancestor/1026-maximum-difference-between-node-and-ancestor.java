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
    int ans = 0;
    public int maxAncestorDiff(TreeNode root) {
         
        maxdif(root, root.val, root.val);
        return ans;
    }
    public void maxdif(TreeNode root, int min, int max){
        if(root == null) return;
        max = Math.max(max, root.val);
        min = Math.min(min, root.val);
        int dif = Math.abs(max - min);
        ans = Math.max(ans , dif);
        maxdif(root.left, min, max);
        maxdif(root.right, min, max);

    }
}