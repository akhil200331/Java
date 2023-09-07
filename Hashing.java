//21BCE9784 VADDI AKHIL LAB-8 Q-2
import java.util.*;
public class Hashing {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    HashMap<String,Integer> hp=new HashMap<String,Integer>();
    System.out.print("Enter the number of values to be inserted = ");
    int n=sc.nextInt();
    String address[]=new String[n];
    int keyvalue[]=new int[n];
    for (int i=0;i<n;i++) {
      System.out.println("Enter the address and keyvalue for -"+(i+1));
      address[i]=sc.next();
      keyvalue[i]=sc.nextInt();
      hp.put(address[i], keyvalue[i]);
    }
    System.out.println("Hash Map = "+hp);
    System.out.println("Enter the address value to get corressponding keyvalue:");
    String get=sc.next();
    if (hp.containsKey(get)) {
      int q=hp.get(get);
      System.out.println("Value for address "+get+" = "+q);
    }
    else {
      System.out.println(get+" not found in hash table.");
    }
  }
}
