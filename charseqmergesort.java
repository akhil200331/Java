// Vaddi Akhil 21BCE9784 Lab-7 Q-3
public class charseqmergesort {
  public static void mergesort(char arr[],int lb,int ub) {
    if (lb<ub) {
      int mid=(int) Math.floor((lb+ub)/2);
      mergesort(arr, lb, mid);
      mergesort(arr, mid+1, ub);
      merge(arr,lb,mid,ub);
    }
  } 
  public static void merge(char arr[],int lb,int mid,int ub) {
    int i=lb;
    int j=mid+1;
    int k=lb;
    char b[]=new char[arr.length];
    while (i<=mid && j<=ub) {
      if (arr[i]<=arr[j]) {
        b[k]=arr[i];
        i++;
        k++;
      }
      else {
        b[k]=arr[j];
        j++;
        k++;
      }
    }
    if (i>mid) {
      while (j<=ub) {
        b[k]=arr[j];
        j++;
        k++;
      }
    }
    else {
      while (i<=mid) {
        b[k]=arr[i];
        i++;
        k++;
      }
    }
    for (k=lb;k<=ub;k++) {
      arr[k]=b[k];
    }
  }
  public static void displayaftersorting(char arr[]) {
    for (int p=0;p<arr.length;p++) {
      System.out.print(arr[p]+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    char arr[]={'a','y','Y','G'};
    System.out.println("Given Array: ");
    displayaftersorting(arr);
    mergesort(arr, 0, arr.length-1);
    System.out.println("After sorting");
    displayaftersorting(arr);
  }
}