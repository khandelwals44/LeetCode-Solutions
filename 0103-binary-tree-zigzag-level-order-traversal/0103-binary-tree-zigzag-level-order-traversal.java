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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null) return result;
        
        q.add(root);
        boolean flag = true;
        
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> subList = new ArrayList<>();
            
            for(int i = 0;i<size;i++){
                TreeNode A = q.peek();
                q.poll();
                
                if(flag) subList.add(A.val);
                else subList.add(0,A.val);
                
                if(A.left != null) q.add(A.left);
                
                if(A.right != null) q.add(A.right);
            }
            flag = !flag;
            result.add(subList);
        }
        
        return result;
    }
}