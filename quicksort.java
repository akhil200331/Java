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







/*
import java.util.Scanner;

public class quicksortt {
  public static void quickSort(int arr[], int low, int high)
    {
        if (low<high){
        int pivot=partition(arr,low,high);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);
        // code here
        }
    }
    public static int partition(int arr[], int low, int high)
    {
      // your code here
      int i = low + 1;
      int j = high;
      int pivot = arr[low];
      while (true) {
        while (i <= high && arr[i] <= pivot)
          i++;
        while (i <= high && arr[j] > pivot)
          j--;
        if (i > j)
          break;

        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;

      }
      int temp = arr[j];
      arr[j] = arr[low];
      arr[low] = temp;
      return j;
    }
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();// number of elemnets in an array
    int arr[] = new int[n];// array declaration
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt(); //taking input
    }
    quickSort(arr, 0, n - 1);
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]+"   ");
    }
  }
    }



*/
