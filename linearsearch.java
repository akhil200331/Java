//21BCE9784 VADDI AKHIL LAB-8 Q-1(a)
import java.util.Scanner;

public class linearsearch {
  public static int lsearch(int arr[],int data) {
    for(int i=0;i<arr.length;i++){
      if (data==arr[i]) {
        return i;
      }
    }
    //O(n) is worst case
    //bestcase is (1)
    return -1;
  }
  public static void main(String[] args) {
    int arr[]={12,13,1,23,16,90};
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the element to be searched");
    int data=sc.nextInt();
    if (lsearch(arr, data)==-1) {
      System.out.println("Element not found");
    }
    else {
      System.out.print("Element found at "+lsearch(arr, data));
    }
  }
}