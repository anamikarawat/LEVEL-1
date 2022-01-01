import java.util.*;

public class Main{

public static void primeFactor(int n){
    for( int pn =2; pn*pn <= n; pn++){
        while(n % pn == 0){
          System.out.print(pn + " ");
          n /=pn;
        }
    }
    if (n != 1)
    System.out.print(n);
}
public static void main(String[] args) {
 Scanner scn = new Scanner(System.in);
 int n = scn.nextInt();
 primeFactor(n);
 }
}