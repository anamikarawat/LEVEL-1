import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    pdi(n);
  }

  public static void pdi(int n) {

    if (n == 0) {                 //1 check point
      return;
    }
    System.out.println(n);        //2  check point
    pdi(n - 1);                   //3  check point
    System.out.println(n);        //4  check point
  }

}