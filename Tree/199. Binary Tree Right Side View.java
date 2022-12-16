class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        if(root==null){
            return l;
        }
        Deque<TreeNode> queue=new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int n=queue.size();
            for(int i=1;i<=n;i++){
                TreeNode temp=queue.poll();
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
                if(i==n){
                    l.add(temp.val);
                }
            }
        }
        return l;
    }
}
