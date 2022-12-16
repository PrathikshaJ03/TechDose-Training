public class Codec {
    String res="";
    int pos=-1;
    public String serialize(TreeNode root) {
        toString(root);
        return res;
    }

    public void toString(TreeNode root){
        if(root==null){
            res+='*'+" ";
            return;
        }
        res=res+root.val+" ";
        toString(root.left);
        toString(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return helper(data.split(" "));
    }

    public TreeNode helper(String[] data){
        pos++;
        if(data[pos].equals("*")){
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(data[pos]));
        root.left=helper(data);
        root.right=helper(data);
        return root;
    }
}
