class Solution {

    public int calc(TreeNode root) {
        if (root == null) return 0;

        int lh = calc(root.left);
       if (lh == -1) return -1;

        int rh = calc(root.right);
       if (rh == -1) return -1;

        if (Math.abs(lh - rh) > 1) return -1;

        return Math.max(lh, rh) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        return calc(root) != -1;
    }
}
