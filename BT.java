import java.util.*;
class BTtree {
  int data;
  BTtree left,right;
}
class BT {
  Scanner sc=new Scanner(System.in);
  static BTtree create() {
    Scanner sc=new Scanner(System.in);
    BTtree root=new BTtree();
    System.out.println("Enter the current Node: ");
    root.data = sc.nextInt();
    System.out.println("Is there any left node to "+root.data);
    char c=sc.next().charAt(0);
    if (c=='y' || c=='Y') {
      root.left=create();
    }
    else {
      root.left=null;
    }
    System.out.println("is there any right node to "+root.data);
    char p=sc.next().charAt(0);
    if (p=='y' || p=='Y') {
      root.right=create();
    }
    else {
      root.right=null;
    }
    return root;
  }
  static void inorder(BTtree root) {
    if (root!=null) {
      inorder(root.left);
      System.out.println(root.data);
      inorder(root.right);
    }
  }
  static void preorder(BTtree root) {
    if (root!=null) {
      System.out.println(root.data);
      inorder(root.left);
      inorder(root.right);
    }
  }
  static void postorder(BTtree root) {
    if (root!=null) {
      inorder(root.left);
      inorder(root.right);
      System.out.println(root.data);
    }
  }
  public static void main(String[] args) {
    BTtree r;
    r=create();
    inorder(r);
    preorder(r);
    postorder(r);
    
  }
}
