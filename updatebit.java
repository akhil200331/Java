import java.util.*;
public class updatebit {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    System.out.println("Enter the bit place: ");
    int pos=sc.nextInt();
    int bm=1 << (pos-1);
    int c;
    System.out.println("Enter the bit to be changed into:");
    int y=sc.nextInt();
    if (y==1) {
      c= bm | n;
      System.out.println("After updating = "+c);
    }
    else if(y==0) {
      c=n & (~bm);
      System.out.println("After Updating = "+c);
    }
    else {
      System.out.println("Invalid input");
    }
  }
}