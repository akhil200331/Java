// VADDI AKHIL 21BCE9784 LAB- Q-1
import java.util.*;
public class quicksort {
  public static void quicksort(int arr[],int low,int high) {
    if (low<high) {
      int pidx=partition(arr,low,high);
      quicksort(arr, low, pidx-1);
      quicksort(arr, pidx+1, high);
    }
  }
  public static int partition(int arr[],int low,int high) {
    int i=low-1;
    int pivot=arr[high];
    int temp=0;
    for (int j=low;j<high;j++) {
      if (arr[j]<pivot) {
        i++;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      }
    }
    i++;
    temp=arr[i];
    arr[i]=pivot;
    arr[high]=temp;
    return i;
  }
  public static void main(String[] args) {
    int[] arr={6,3,9,5,2,8};
    int l=arr.length;
    quicksort(arr, 0, l-1);
    System.out.println("After Sorting:");
    for (int i=0;i<l;i++) {
      System.out.print(arr[i]+" ");
    }
  }
}
