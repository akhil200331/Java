//Vaddi Akhil 21BCE9784 Lab-9 Depth First Search
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class DFS {
    int nv;  //number of verices
    LinkedList<Integer> adj[];//adacency list
    boolean vv[];
  DFS(int v) {
    this.nv=v;
    adj=new LinkedList[v];
    vv=new boolean[v];
    for (int i=0;i<v;i++) {
      adj[i]=new LinkedList();
    }
  }
  void addedge(int p,int q) {
    adj[p].add(q);
  }
  void DFSUtil(int v, boolean visited[]) {
      visited[v] = true;
      System.out.print(v + " ");
      Iterator<Integer> i = adj[v].listIterator();
      while (i.hasNext()) {
          int n = i.next();
          if (!visited[n]) {
              DFSUtil(n, visited);
          }
      }
  }
  void search(int v)
  {
      boolean visited[] = new boolean[nv];
      DFSUtil(v, visited);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of vertices: ");
    int nv=sc.nextInt();
    DFS b = new DFS(nv);
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
    System.out.println("DFS Traversal: ");
    b.search(0);
  }
}
