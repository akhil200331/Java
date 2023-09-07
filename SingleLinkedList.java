// VADDI AKHIL 21BCE9784
import java.util.*;
import org.w3c.dom.Node;
class SingleLinkedList {
  Node head;
  public static class Node {
    int data;
    Node next;
    public Node(int data) {
      this.data=data;
      this.next=null;
    }
  }

  public void insertatbegging(int data) {
    Node p=new Node(data);
    if (head==null) {
      head=p;
    }
    else {
      p.next=head;
      head=p;
    }
  }
  public void insertatendding(int data) {
    Node p=new Node(data);
    if (head==null) {
      head=p;
    }
    Node curr=head;
    while(curr.next!=null) {
      curr=curr.next;
    }
    curr.next=p;
  }
  public void insertatposition(int data,int pos) {
    
    Node curr=head;
    for (int i=1;i<pos-1;i++) {
      curr=curr.next;
      if (curr==null) {
        System.out.println("Position insertion is greater the number of elements");
      }
    }
    Node p=new Node(data);
    p.next=curr.next;
    curr.next=p;
  }
  public void deleteatbegging() {
    if (head==null) {
      System.out.println("No Elements To delete");
    }
    Node curr=head;
    head=curr.next;
    curr=null;
  }
  public void deleteatendding() {
    if (head==null) {
      System.out.println("Empty");
    }
    if (head.next==null) {
      head=head.next;
    }
    Node curr=head;
    Node prev=null;
    while (curr.next!=null) {
      prev=curr;
      curr=curr.next;
    }
    prev.next=null;
  }
  public void deleteatposition(int pos) {
    Node curr=head;
    for (int i=1;i<pos;i++) {
      if (curr==null) {
        System.out.println("Impossible to delete");
        curr=curr.next;
      }
      curr.next=curr.next.next;
      curr=null;
    }
  }
  public void display() {
    Node curr=head;
    while (curr!=null) {
      System.out.print(curr.data+"-->");
      curr=curr.next;
    }
    System.out.println("null");
  }
  public static void main(String[] args) {
    SingleLinkedList y=new SingleLinkedList();
    y.insertatbegging(98);
    y.insertatendding(56);
    y.insertatposition(45, 2);
    y.insertatendding(78);
    y.insertatendding(67);
    y.insertatendding(455);
    y.deleteatbegging();
    y.deleteatendding();
    y.deleteatposition(2);
    y.deleteatendding();
    y.display();
  }
}
