import java.util.*;
class CircularLinkedList {
  Node head;
  public static class Node {
    Node prev;
    Node next;
    int data;
    public Node(int data) {
      this.data=data;
      this.next=null;
      this.prev=null;
    }
  }
  public void insertatbeginning(int data) {
    Node p=new Node(data);
    if (head==null) {
      head=p;
    }
    else {
      p.next=head;
      head.prev=p;
      head=p;
    }
  }
  public void insertatendding(int data) {
    Node p=new Node(data);
    Node curr=head;
    while (curr.next!=null) {
      curr=curr.next;
    }
    curr.next=p;
    p.prev=curr;
  }
  public void insertatposition(int data,int pos) {
    Node p=new Node(data);
    Node curr=head;
    for (int i=1;i<pos-1;i++) {
      if (curr==null) {
        curr=curr.next;
        System.out.println("Not possible to insert");
      }
      
    }
    Node temp=curr.next;
    curr.next=p;
    p.next=temp;
    p.prev=curr;
    temp.prev=p;
  }
  public void deleteatbegining() {
    if (head==null) {
      System.out.println("No elements to delete");
    }
    Node curr=head;
    head=curr.next;
    head.prev=null;
  }
  public void deleteatendding() {
    Node curr=head;
    while(curr.next!=null) {
      curr=curr.next;
    }
    Node temp=curr.prev;
    temp.next=null;
  }
  public void deleteatposition(int pos) {
    Node curr=head;
    for (int i=1;i<pos-1;i++) {
      curr=curr.next;
      if (curr==null) {
        System.out.println("Impossible to delete");
      }
    }
    Node temp=curr.next;
    Node t=temp.next;
    curr.next=t;
    t.prev=curr;
    temp=null;
  }
  public void forwarddisplay() {
    Node curr=head;
    while(curr!=null) {
      System.out.print(curr.data+"-->");
      curr=curr.next;
    }
    System.out.println("Null");
  }
  public void backwarddisplay() {
    Node curr=head;
    while(curr.next!=null) {
      curr=curr.next;
    }
    while (curr!=null) {
      System.out.print(curr.data+"-->");
      curr=curr.prev;
    }
    System.out.println("Null");
  }
  public static void main(String[] args) {
    CircularLinkedList k=new CircularLinkedList();
    k.insertatbeginning(67);
    k.insertatbeginning(89);
    k.insertatbeginning(45);
    k.insertatendding(78);
    k.deleteatbegining();
    k.deleteatendding();
    k.insertatposition(34, 2);
    k.deleteatposition(2);
    k.forwarddisplay();
    k.backwarddisplay();
  }
}