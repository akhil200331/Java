import java.util.*;
public class DLL {  
  class Node{  
      int data;  
      Node previous;  
      Node next;  

      public Node(int data) {  
          this.data = data; 
      }  
  }   
  Node head, tail = null;
  public void addNodeatEnd(int data) {  
      Node newNode = new Node(data);
      if(head == null) {
          head = tail = newNode;    
          head.previous = null;  
          tail.next = null;  
      }  
      else {  
          tail.next = newNode;  
          newNode.previous = tail;    
          tail = newNode;  
          tail.next = null;  
      }  
  }
  public void delatend() {
    if(head != null) {
      
      //1. if head in not null and next of head
      //   is null, release the head
      if(head.next == null) {
        head = null;
      }
      else {
        Node temp;
        temp = head;
        while(temp.next.next != null)
          temp = temp.next;
          Node tail = temp.next;
          temp.next = null; 
          tail = null;
      }
    }
  }
  public void display() {    
      Node current = head;  
      if(head == null) {  
          System.out.println("List is empty");  
          return;  
      }  
      System.out.println("Nodes of doubly linked list: ");  
      while(current != null) {   
          System.out.print(current.data + "<-->");  
          current = current.next;  
      }
      System.out.println("Null");
  }  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    DLL d = new DLL();
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
        d.delatend();
      }
      else if (n==4) {
        flag=false;
      }
    }
  }  
} 