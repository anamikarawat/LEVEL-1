import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
//find the element 'd' and print its position or index 'i' , if it is not present then print -1
    int d = scn.nextInt();

    for (int i = 0; i < arr.length; i++) {
      if (d == arr[i]) {
        System.out.println(i);
        return;
      }
    }
    System.out.println(-1);
  }

}

//============2nd method
//find the element 'd' and print its position or index 'i' , if it is not present then print -1
    int d = scn.nextInt();
    int idx=-1;
    for (int i = 0; i < arr.length; i++) {
      if (d == arr[i]) {
        idx = i;
        break;
        //break eslea kyuki hume sabse phele vala idx print karna h jo hume sabse phele mila ho
      }
    }
    System.out.println(idx);

