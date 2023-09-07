import java.util.ArrayList;

public class AL {
  static class Edge {
    String source;
    String des;
    public Edge(String src,String des) {
      this.source=src;
      this.des=des;
    }
  }
  public static void main(String[] args) {
    int s=5;
    ArrayList<Edge>[] arr=new ArrayList[s];
    for (int i=0;i<s;i++) {
      arr[i]=new ArrayList<>();
    }
    arr[0].add(new Edge("A","B"));
    arr[0].add(new Edge("B", "C"));
    for (int i=0;i<s;i++) {
      System.out.println((arr[i]));
    }
  }

}