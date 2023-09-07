// Vaddi Akhil 21BCE9784 BST Q-1
public class BST {
  static class Node {
    int data;
    Node right;
    Node left;
    public Node(int data) {
      this.data=data;
      this.right=null;
      this.left=null;
    }
  }
  public static Node Insert(Node root,int val) {
    if (root==null) {
      root=new Node(val);
      return root;
    }
    if (root.data>val) {
      root.left=Insert(root.left,val);
    }
    else {
      root.right=Insert(root.right, val);
    }
    return root;
  }
  public static Node Delete(Node root,int val) {
    if (root.data>val) {
      root.left=Delete(root.left,val);
    }
    else if(root.data<val) {
      root.right=Delete(root.right,val);
    }
    else {
      //case-1 
      if (root.right==null && root.left==null) {
        return null;
      }
      //case-2
      if (root.right==null) {
        return root.left;
      }
      else if (root.left==null) {
        return root.right;
      }
      //case-3
      Node ls=inordersuccesor(root.right);
      root.data=ls.data;
      root.right=Delete(root.right,ls.data);
    }
    return root;
  }
  public static Node inordersuccesor(Node root) {
    while (root.left!=null) {
      root=root.left;
    }
    return root;
  }
  public static boolean Search(Node root,int key) {
    if (root==null) {
      return false;
    }
    if (key==root.data) {
      return true;
    }
    else if (key<root.data) {
      return Search(root.left, key);
    }
    else {
      return Search(root.right, key);
    }
  }
  public static void Inorder(Node root) {
    if (root==null) {
      return;
    }
    Inorder(root.left);
    System.out.print(root.data+",");
    Inorder(root.right);
  }
  public static void main(String[] args) {
    int values[]={65,34,90,4,15,2,88,56,35,3,1,7,5,9,6,8,10,22,16,99};
    Node root=null;
    for (int i=0;i<20;i++) {
      root=Insert(root, values[i]);
    }
    System.out.println("Inorder: ");
    Inorder(root);
    System.out.println();
    System.out.println("Is 101 is there ?   -- "+Search(root, 101));
    Delete(root, 10);
    System.out.println("Inorder after deleting: ");
    Inorder(root);
  }
}