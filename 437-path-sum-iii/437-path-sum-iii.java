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
    int dfs(TreeNode root , int sum){
        if(root==null) return 0;
        int count = 0;
        if(root.val==sum) count++;
        count += dfs(root.left,root.val-sum) + dfs(root.right,root.val-sum);
        return count;
    }
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return dfs(root.left,sum) + dfs(root.right,sum) + pathSum(root,sum);
    }
}
