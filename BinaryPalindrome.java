import java.util.*;
public class BinaryPalindrome{
  public static boolean BinaryPalindromee(int x){
    int o=x;
    int r=0;
    while(x>0){
      r=r<<1;
      r=r|(x&1);
      x>>=1;
    }
    return o==r;
  }
  public static void main(String[] args) {
    System.out.println(BinaryPalindromee(5));
  }
}