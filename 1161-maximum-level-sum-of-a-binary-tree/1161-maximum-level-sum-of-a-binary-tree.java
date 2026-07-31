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
    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;
        int level = 1;
        int max = Integer.MIN_VALUE;
        int ans = 0;
        Queue<TreeNode> q = new LinkedList<>();
         q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            int cursum = 0;
          
            for(int i = 0; i < n; i++){
                TreeNode p = q.poll();
                cursum += p.val;
                if(p.left != null) q.add(p.left);
                if(p.right != null) q.add(p.right);

            }
            if(cursum > max) {
                max = cursum;
                ans = level;
            }
            level++;
        }
        return ans;

    }
}