import java.util.*;
public class flipone {
  public static int maxl(String a[]){
    int max=a[0].length();
    for (int i=1;i<a.length;i++){
      if (max < a[i].length()){
        max=a[i].length();
      }
    }
    return max;
  }
  public static void main(String[] args) {
    int M=Integer.MIN_VALUE;
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    String t=Integer.toBinaryString(x);
    for (int i=0;i<t.length();i++){
      String s=t;
      if (s.charAt(i)=='0'){
        s=s.substring(0, i)+'1'+s.substring(i+1, s.length());
      }
      String arr[]=s.split("0");
      int m=maxl(arr);
      if (M<m){
        M=m;
      }
    }
    System.out.println(M);
  }
}
