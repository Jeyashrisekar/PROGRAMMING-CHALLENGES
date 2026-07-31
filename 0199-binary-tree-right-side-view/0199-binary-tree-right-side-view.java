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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if(root == null) return l;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            //int n = q.size();
            //TreeNode popped = null;
            // for(int i = 0; i < n; i++){
            //     popped = q.poll();
            //     if(popped.left != null) q.add(popped.left);
            //     if(popped.right != null) q.add(popped.right);
            // }
            // l.add(popped.val);
            int s = q.size();
            List<Integer> t = new ArrayList<>();
            for(int i = 0; i < s; i++){
                TreeNode popped = q.poll();
                t.add(popped.val);
                if(popped.left != null) q.add(popped.left);
                if(popped.right != null) q.add(popped.right);

            }
            l.add(t.get(s-1));
        }
        return l;
        
    }
}