// First Method (My solution)
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

// Another Method
class Solution {
    boolean res=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        pathSum(root,targetSum);
        return res;
    }
    
    public void pathSum(TreeNode root,int target){
        if(root!=null){
            root.val=target-root.val;
            if(root.left==null && root.right==null && root.val==0){
                res=true;
                return;
            }
            pathSum(root.left,root.val);
            pathSum(root.right,root.val);
        }
    }
}
