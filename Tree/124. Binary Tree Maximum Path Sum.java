class Solution {
    int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        gainPathSum(root);
        return maxSum;
    }
    public int gainPathSum(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=Math.max(gainPathSum(root.left),0);
        int right=Math.max(gainPathSum(root.right),0);
        maxSum=Math.max(root.val+left+right,maxSum);
        return Math.max(left+root.val,right+root.val);
    }
}
