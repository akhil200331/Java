import java.util.*;
public class setbit {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    System.out.println("Enter the bit place: ");
    int pos=sc.nextInt();
    int bm=1 << (pos-1);
    int setbitn=(bm | n);
    System.out.println(setbitn);
  }
}