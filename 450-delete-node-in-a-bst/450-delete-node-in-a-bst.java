
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val > key) root.left = deleteNode(root.left,key);
        else if(root.val < key) root.right = deleteNode(root.right,key);
        else{
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            TreeNode small = min(root.right);
            root.val = small.val;
            root.right=deleteNode(root.right,small.val);
        }
        return root;
    }
    public TreeNode min(TreeNode root){
        while(root.left!=null) root=root.left;
        return root;
    }
}