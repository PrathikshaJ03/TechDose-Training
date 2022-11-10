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
    List<TreeNode> l=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        if(root==null){
            return root;
        }
        inorder(root);
        return BST(0,l.size()-1);
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        l.add(root);
        inorder(root.right);
    }
    public TreeNode BST(int left,int right){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode root=l.get(mid);
        root.left=BST(left,mid-1);
        root.right=BST(mid+1,right);
        return root;
    }
}
