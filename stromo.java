import java.util.*;
  public class stromo {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String n="69";
    String o="10698";
    String r="10968";
    String rev="";
    String sn="";
    for (int i=n.length()-1;i>=0;i--){
      rev+=n.charAt(i);
    }
    int j=0;
    int c=0;
    while (j<rev.length()){
      String oo=""+rev.charAt(j);
      if (o.contains(oo)){
        sn+=r.charAt(o.indexOf(oo));
        j++;
      }
      else{
        c++;
        j++;
      }
      
    }
    System.out.println("n="+n);
    System.out.println("sn="+sn);
    if (c==0){
      if (n.equals(sn)){
        System.out.println(true);
      }
      else{
        System.out.println(false);
      }
    }
    else{
      System.out.println(false);
    }
  }
}
