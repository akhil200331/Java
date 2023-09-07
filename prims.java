//VADDI AKHIL 21BCE9784 LAB-9 PRIMS ALGORITHM
import java.util.Arrays;
// {0,1,2,3,4,5,6,7} is same as {A,B,C,D,E,F,G,H}
public class prims {
  public void prim(int grap[][],int V,char ch[]) {
    //removing loops;
    for (int i=0;i<V;i++) {
      for (int j=0;j<V;j++) {
        if (i==j) {
          grap[i][j]=0;
        }
      }
    }
    int sum=0;//mst cost
    //Set some value max to compare it and set min value
    int inf=Integer.MAX_VALUE;
    int ne=0; //No of edges
    boolean vv[]=new boolean[V];
    Arrays.fill(vv, false);
    //as no of edges be V-1 in mst
    vv[0]=true;
    System.out.println("Edge      :    Weight");
    while (ne<V-1) {
      int min=inf;
      int x=0;  //Row index
      int y=0;  //column
      for (int i=0;i<V;i++) {
        if (vv[i]==true) {
          for (int j=0;j<V;j++) {
            if (!vv[j]&&grap[i][j]!=0) {
              if (min>grap[i][j]) {  //
                min=grap[i][j];
                x=i;
                y=j;
              }
            }
          }
        }
      }
      System.out.println(ch[x]+"-"+ch[y]+"             "+grap[x][y]);
      sum+=grap[x][y];
      vv[y]=true;
      ne++;
    }
    System.out.println("Minimum weigth of mst = "+sum);
  }
  public static void main(String[] args) {
    int nv=8;
    char m[]={'A','B','C','D','E','F','G','H'};
    int grap[][]={{0,8,0,0,0,10,0,4},{8,0,4,0,10,7,0,9},{0,4,0,3,0,3,0,0},{0,0,3,0,25,18,2,0},{0,10,0,25,0,2,7,0},{10,7,3,18,2,0,0,0},{0,0,0,2,7,0,0,3},{4,9,0,0,0,0,3,0}};
    prims p=new prims();
    p.prim(grap,nv,m);
  }
}
