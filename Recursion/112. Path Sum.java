class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        return pathSum(root,0,targetSum);
    }
    public static boolean pathSum(TreeNode root,int sum,int target){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            if(sum+root.val==target){
                return true;
            }
            else{
                return false;
            }
        }
        if(pathSum(root.left,sum+root.val,target)){
            return true;
        }
        else if(pathSum(root.right,sum+root.val,target)){
            return true;
        }
        else{
            return false;
        }
    }
}
