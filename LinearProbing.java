//21BCE9784 VADDI AKHIL LAB-8 Q-5
//hashing collision occurs solved by linear probing
import java.util.*;
public class LinearProbing {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    HashMap<Integer,Integer> hp=new HashMap<Integer,Integer>();
    int keyvalue[]={9,7,11,13,12,8};
    int m=10;  //hash table size=10
    for (int i=0;i<keyvalue.length;i++) {
      if (hp.containsKey(((2*keyvalue[i])+3)%10)) {
        int j=0;
        int p=(((2*keyvalue[i])+3)%10);
        while (hp.containsKey((p+j)%10)) {
          j=j+1;
        }
        hp.put((p+j)%10,keyvalue[i]);
      }
      else {
        hp.put(((2*keyvalue[i])+3)%10,keyvalue[i]);
      }
    }
    System.out.println("Hash Map = "+hp);
  }
}
