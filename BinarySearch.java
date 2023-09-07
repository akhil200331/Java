//21BCE9784 VADDI AKHIL LAB-8 Q-4
import java.lang.*;
import java.util.Scanner;
public class BinarySearch {
  public static int bsearch(int sortarr[],int data) {
    int low=0;
    int high=sortarr.length-1;
    while (low<=high) {
      int mid=(low+high)/2;
    if (data == sortarr[mid]) {
      return mid;
    }
    else if(data>sortarr[mid]) {
      low=mid+1;
    }
    else {
      high=mid-1;
    }
  }
    return -1;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the element to be searched:");
    int data=sc.nextInt();
    int arr[]={12,33,42,51,66,73,87,99,101};//sorted array
    if (bsearch(arr,data)==-1) {
      System.out.println("Element Not found");
    }
    else {
      System.out.println("Element found at index "+bsearch(arr,data));
    }
  }
}
