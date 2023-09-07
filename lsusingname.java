//21BCE9784 VADDI AKHIL LAB-8 Q-3
import java.util.Scanner;

public class lsusingname {
  public static int lsearch(String arr[],String data) {
    for(int i=0;i<arr.length;i++){
      if (data.equals(arr[i])) {
        return i;
      }
    }
    //O(n) is worst case
    //bestcase is (1)
    return -1;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of persons: ");
    int n=sc.nextInt();
    String arrn[]=new String[n];
    String arrc[]=new String[n];
    int arra[]=new int[n];
    for (int i=0;i<n;i++) {
      System.out.println("Enter the details as name age city for person - "+(i+1));
      arrn[i]=sc.next();
      arra[i]=sc.nextInt();
      arrc[i]=sc.next();
    }
    System.out.println("Enter the element to be searched");
    String data=sc.next();
    if (lsearch(arrn,data)==-1) {
      System.out.println("Element not found");
    }
    else {
      System.out.print("Person exists");
    }
  }
}