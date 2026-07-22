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
        return count + dfs(root.left, sum - root.val) + dfs(root.right, sum - root.val);
    }
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return dfs(root.left,sum) + dfs(root.right,sum) + pathSum(root,sum);
    }
}
