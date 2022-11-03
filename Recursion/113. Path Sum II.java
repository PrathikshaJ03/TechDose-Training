class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        findPath(root,targetSum,new ArrayList<Integer>());
        return res;
    }
    public void findPath(TreeNode root,int target,List<Integer> l){
        if(root!=null){
            l.add(root.val);
            root.val=target-root.val;
            if(root.left==null && root.right==null && root.val==0){
                res.add(new ArrayList<>(l));
            }
            findPath(root.left,root.val,l);
            findPath(root.right,root.val,l);
            l.remove(l.size()-1);
        }
    }
}
