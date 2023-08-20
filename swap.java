import java.util.Scanner;

public class swap {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    String s=Integer.toBinaryString(x);
    int l=s.length();
    System.out.println(Integer.parseInt(s.substring(l-4,l)+s.substring(l-8,l-4),2));
  }
}
