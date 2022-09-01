import java.io.*;
import java.util.*;

public class Main {
  public static void main(String [] args) {
    //Binary search
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt(); //size of array
    
    int [] arr = new int[n];
    for (int i = 0; i < n; i++) { //input values
      arr[i] = scn.nextInt();
    }
    int x = scn.nextInt(); // find the value x
    
    int li = 0; //left side
    int ri = arr.length - 1; //right side

    while (li <= ri) {
      int mid = (li + ri) / 2; //mid of array

      if (arr[mid] == x) {
        System.out.println(mid);
       return;
      }
      else if (arr[mid] > x) {
        ri = mid - 1;
      }
      else {
        li = mid + 1;
      }
    }
    System.out.println(-1);
  }
}

// n = 5
//arr = [2 , 4 , 6 , 7 , 9 ]
//find x = 6
//output= 2
