//VADDI AKHIL 21BCE9784 LAB-9 BREADTH FIRST SEARCH
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class BFS {
    int nv;  //number of verices
    LinkedList<Integer> adj[];//adacency list
  BFS(int v) {
    this.nv=v;
    adj=new LinkedList[v];
    for (int i=0;i<v;i++) {
      adj[i]=new LinkedList();
    }
  }
  void addedge(int p,int q) {
    adj[p].add(q);
  }
  void search(int source) {
    //mark not visited nodes
    boolean vv[]=new boolean[nv];
    LinkedList<Integer> queue=new LinkedList<Integer>();
    vv[source]=true;
    queue.add(source);
    while (queue.size()!=0) {
      source=queue.poll();
      System.out.print(source+" ");
      // Get all adjacent vertx of source if adj not visited add it
      Iterator <Integer> i=adj[source].listIterator();
      while (i.hasNext()) {
        int n=i.next();
        if (!vv[n]) {
          vv[n]=true;
          queue.add(n);
        }
      }
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of vertices: ");
    int nv=sc.nextInt();
    BFS b = new BFS(nv);
    boolean f=true;
    while (f) {
      System.out.println("1.Add the edge");
      System.out.println("2.Close");
      int q=sc.nextInt();
      if (q==1) {
        System.out.println("Enter two edges : ");
        int s=sc.nextInt();
        int d=sc.nextInt();
        b.addedge(s, d);
      }
      else {
        f=false;
      }
    }
    System.out.println("BFS Traversal:");
    b.search(0);
  }
}
