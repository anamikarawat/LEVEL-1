import java.io.*;
import java.util.*;

public class Main {

  public static void solution(String str) {
    // write your code here
    int n = str.length();//length of string
    int f = factorial(n);//fact of string
    for (int i = 0; i < f; i++) {
      StringBuilder sb = new StringBuilder(str);
      //StringBuilder mea original string 'abc' ko dal diya or humea original string se hi character remove karege eslea  SB use kara
      int temp = i; //0,1,2,3,4,...(n-1)
      for (int div = n; div >= 1; div--) {
        int quot = temp / div;
        int remainder = temp % div;

        System.out.print(sb.charAt(remainder));//remainder vala char print kardiya
        sb.deleteCharAt(remainder);// delete that remainder vala char form original string

        temp = quot;
      }
      System.out.println();
    }

  }

  public static int factorial(int n) {
    int val = 1;
    for (int i = 2; i <= n; i++) {
      val *= i;
    }
    return val;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    solution(str);
  }

}
