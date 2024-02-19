import java.util.Arrays;
import java.util.Comparator;

class Item{
  int value,weight;
  Item(int value,int weight){
    this.value=value;
    this.weight=weight;
  }
}
public class fractional_knapsack {
  public static double fractionalKnapsack(int W, Item arr[], int n) 
  {
    // Your code here
    Arrays.sort(arr, Comparator.comparingDouble(item -> (double) item.value / item.weight));
    double profit = 0;
    for (int j = n - 1; j >= 0; j--) {
      Item i = arr[j];
      if (i.weight <= W) {
        W -= i.weight;
        profit += i.value;
      } else {
        double fr = (double) W / (double) i.weight;
        profit += (fr * (double) i.value);
        break;
      }
    }
    return profit;
  }

  public static void main(String[] args) {
      Item arr[]={
        new Item(30,5),new Item(40,10),new Item(45,15),new Item(77,22),new Item(90,25)
      };
      int Weight = 60;
      
      System.out.println("Maximum Profit = "+ fractionalKnapsack(Weight, arr, 5));
    }
}
