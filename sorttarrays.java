import java.util.Arrays;

public class sorttarrays {
  public static void main(String[] args) {
    int arr[]={7,8,9,1,2};
    for (int i=0;i<arr.length;i++) {
      for (int j=0;j<arr.length;j++) {
        while (arr[i]<arr[j]) {
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}