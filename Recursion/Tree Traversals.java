import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
class BST{
    static Node head=null;
    public static void add(int val){
        if(head==null){
            head=new Node(val);
            return ;
        }
        addBST(head,val);
    }
    public static void addBST(Node root,int val){
        if(root.data>val){
            if(root.left==null){
                root.left=new Node(val);
                return ;
            }
            addBST(root.left,val);
        }
        else{
            if(root.right==null){
                root.right=new Node(val);
                return ;
            }
            addBST(root.right,val);
        }
    }
    public static void preOrder(){
        preOrderTraversal(head);
    }
    public static void preOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static void postOrder(){
        postOrderTraversal(head);
    }
    public static void postOrderTraversal(Node root){
        if(root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }
    public static void inOrder(){
        inOrderTraversal(head);
    }
    public static void inOrderTraversal(Node root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
}
public class Main{
	public static void main(String[] args) {
	    BST bst=new BST();
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++){
		    bst.add(sc.nextInt());
		}
		System.out.println("Preorder Traversal");
		bst.preOrder();
		System.out.println();
		System.out.println("Postorder Traversal");
		bst.postOrder();
		System.out.println();
		System.out.println("Inorder Traversal");
		bst.inOrder();
	}
}
