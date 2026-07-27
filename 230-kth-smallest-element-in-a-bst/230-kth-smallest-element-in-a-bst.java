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
        int count = 0;
        int k;
    public int kthSmallest(TreeNode root, int k) {
        this.k=k;
        return inorder(root);
    }
    int inorder(TreeNode root){
        if(root == null) return -1;
        int left = inorder(root.left);
        if(left != -1) return left;
        count++;
        if(count == k) return root.val;
        return inorder(root.right);
    }
}