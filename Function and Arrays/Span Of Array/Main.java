import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int min = arr[0];
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }

      if (arr[i] > max) {
        max = arr[i];
      }
    }

    int span = max - min;
    System.out.println(span);
  
 }

}

//===== 2nd method

 public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int min = Integer.MAX_VALUE; // value is + infinity
    int max = Integer.MIN_VALUE; // value is - infinity
    for(int i=0;i<n;i++){
        max =Math.max(max,arr[i]);
        min =Math.min(min,arr[i]);
    }
    
    int span = max - min;
    System.out.println(span);
  }

//============== 3rd method

 public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int max = -(int)1e9;
    int min = (int)1e9; 
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    
    int span = max - min;
    System.out.println(span);
  }
