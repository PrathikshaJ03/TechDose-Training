class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> map=new HashMap<>();
        find(root,map,target);
        List<Integer> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        Set<TreeNode> set=new HashSet<>();
        queue.add(target);
        set.add(target);
        int level=0;
        while(!queue.isEmpty()){
            int n=queue.size();
            if(level==k){
                for(TreeNode temp:queue){
                    res.add(temp.val);
                }
                return res;
            }
            level++;
            for(int i=0;i<n;i++){
                TreeNode temp=queue.poll();
                if(temp.left!=null && !set.contains(temp.left)){
                    queue.add(temp.left);
                    set.add(temp.left);
                }
                if(temp.right!=null && !set.contains(temp.right)){
                    queue.add(temp.right);
                    set.add(temp.right);
                }
                if(map.containsKey(temp) && !set.contains(map.get(temp))){
                    queue.add(map.get(temp));
                    set.add(map.get(temp));
                }
            }
        }
        return res;
    }

    public void find(TreeNode root, Map<TreeNode, TreeNode> map,TreeNode target){
        if(root==null || root==target){
            return;
        }
        if(root.left!=null){
            map.put(root.left,root);
            find(root.left,map,target);
        }
        if(root.right!=null){
            map.put(root.right,root);
            find(root.right,map,target);
        }
    }
}
