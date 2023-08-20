public class Eulerphi {
  public static int gcd(int a,int b){
    if (b%a==0){
      return a;
    }
    return gcd(b%a,a);
  }
  public static void ephi(int N){
    int c=1;
    for (int i=2;i<=N-1;i++){
      if(gcd(i,N)==1){
        System.out.println(i);
        c++;
      }
    }
    System.out.println(c);
  }
  public static void main(String[] args) {
    ephi(15);
  }
}
