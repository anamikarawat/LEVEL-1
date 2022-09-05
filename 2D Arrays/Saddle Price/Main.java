import java.io.*;
import java.util.*;


public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[][] arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = scn.nextInt();
      }
    }


    int colno = 0, min = 0;
    for (int i = 0; i < n; i++) {   // check in rows ki least konsa number h
      min = arr[i][colno];
      for (int j = 0; j < n; j++) {   //move columns
        if (min > arr[i][j]) {
          min = arr[i][j];
          colno = j; //change column idx
        }
      }


      boolean potentialAns = true;
      for (int r = 0; r < n; r++) { //moves rows 
        if (min < arr[r][colno]) { //check that number ki vo maximum hai ya nhi columns mea
          potentialAns = false;
          break;
        }
      }
      if (potentialAns == true) {
        System.out.print(min);
        return;
      }
    }
    System.out.print("Invalid input");
  }
}
