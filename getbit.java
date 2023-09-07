import java.util.*;
public class getbit {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    System.out.println("Enter the bit place: ");
    int pos=sc.nextInt();
    int bm=1 << (pos-1);
    if ((bm & n) ==0) {
      System.out.println("Bit at given place :"+"0");
    }
    else {
      System.out.println("Bit at given place :"+"1");
    }
  }
}