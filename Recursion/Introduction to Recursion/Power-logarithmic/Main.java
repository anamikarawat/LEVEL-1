import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();
   int n = scn.nextInt();
    int ans= power(x,n);
    System.out.println(ans);
    
  }

  public static int power(int x, int n) {

    if (n == 0) {                 //1 check point
      return 1;
    }
   int RecAns = power(x, n/2) ;                  //2  check point
   int result = RecAns*RecAns;                    //3  check point

    if (n % 2 == 1) {             //4  check point
      result = result * x;
    }
    return result;                        //5 check point
  }
}