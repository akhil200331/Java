import java.util.*;
public class CLL1 {  
  class Node{  
      int data;  
      Node prev;  
      Node next;  

      public Node(int data) {  
          this.data = data;
          this.next=null;
          this.prev=null; 
      }  
  }   
  Node head = null;
  public void addNodeatEnd(int data) {  
      Node newNode = new Node(data);
      if(head == null) {
          head =  newNode;    
          newNode.prev = head;  
          newNode.next = head;  
      }  
      else {  
          Node temp=new Node(data);
          temp=head;
          while(temp.next!=null) {
            temp=temp.next;
          }
          temp.next = newNode;
          newNode.next = head;
          newNode.prev = temp;
          head.prev = newNode;
      }  
  }
  public void display() {    
      Node current = head;  
      if(head == null) {  
          System.out.println("List is empty");  
          return;  
      }    
      while(current != null) {   
          System.out.print(current.data + " ");  
          current = current.next;  
      }
  }  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    CLL1 d = new CLL1();
    boolean flag=true;
    while (flag) {
      System.out.println("Enter the Choice:");
      System.out.println("1.Add");
      System.out.println("2.Delete");
      System.out.println("3.Display");
      System.out.println("4.Exit");
      int n=sc.nextInt();
      if (n==1) {
        System.out.println("Enter the data:");
        int f=sc.nextInt();
        d.addNodeatEnd(f);
      }
      else if(n==3) {
        d.display();
      }
      else if(n==2) {
      }
      else if (n==4) {
        flag=false;
      }
    }
  }  
} 