
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        if(root != null) q.add(root);
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode a = q.poll();
                level.add(a.val);
                if(a.left!=null)q.add(a.left);
                if(a.right!=null)q.add(a.right);
            }
            ans.add(level);
        }
        return ans;
    }
}