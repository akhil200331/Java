//Vaddi Akhil 21BCE9784 Lab-9 Dijkstras algorithm
import java.util.Scanner;
//Undirected and directed graph
public class Dijkstras {
  //Giving graph in adjacent matrix format of distance which automatically telss connection b/w vertices
  public static void dijkstras(int grap[][],int source) {
    int count = grap.length;
    boolean[] vv = new boolean[count];   //vv= Visited Vertex
    int[] d = new int[count];     //distance updation array
    for (int i=0;i<count;i++) {
      vv[i]=false;
      d[i]=Integer.MAX_VALUE;
    }
    d[source]=0;
    for (int j=0;j<count;j++) {
      int u=findmindis(d,vv);
      vv[u]=true;
      for (int v = 0; v < count; v++) {
        if (!vv[v] && grap[u][v] != 0 && (d[u] + grap[u][v] < d[v])) {
          d[v] = d[u] + grap[u][v];
        }
      }
    }
    for (int i = 0; i < d.length; i++) {
      System.out.println(String.format("Distance from %s to %s is %s", source, i, d[i]));
    }
  }
  public static int findmindis(int dis[],boolean vv[]) {
    int minDistance = Integer.MAX_VALUE;
    int minDistanceVertex = -1;
    for (int i = 0; i < dis.length; i++) {
      if (!vv[i] && dis[i] < minDistance) {
        minDistance = dis[i];
        minDistanceVertex = i;
      }
    }
    return minDistanceVertex;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of vertices:");
    int n=sc.nextInt();
    int graph[][]=new int[n][n];
    for (int i=0;i<n;i++) {
      for (int j=0;j<n;j++) {
        System.out.println("Enter distance for "+i+" to "+j);
        graph[i][j]=sc.nextInt();
      }
    }
    Dijkstras t=new Dijkstras();
    t.dijkstras(graph,0);
  }
}