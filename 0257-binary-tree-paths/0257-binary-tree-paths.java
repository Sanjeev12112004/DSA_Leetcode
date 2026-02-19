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
    public static void StorePath(List<Integer> path,List<String> ans){
        StringBuilder sb= new StringBuilder("");
        for(int i=0;i<path.size()-1;i++){
            sb.append(Integer.toString(path.get(i)));
            sb.append("->");
        }
        sb.append(Integer.toString(path.get(path.size()-1)));
        ans.add(sb.toString());
    }
    public static void root2leaf(TreeNode root, List<Integer> path,
                                 List<String> ans){
        if(root==null) return;
        path.add(root.val);

        if(root.left==null && root.right==null){
          StorePath(path,ans);
        }
        else{
            root2leaf(root.left,path,ans);
            root2leaf(root.right,path,ans);
        }
        path.remove(path.size()-1);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<Integer> path = new ArrayList<>();
        List<String> ans= new ArrayList<>();
        root2leaf(root,path,ans);
        return ans; 
    }
}