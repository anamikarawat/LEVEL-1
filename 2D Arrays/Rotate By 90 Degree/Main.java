import java.io.*;
import java.util.*;

public class Main {
    
    public static void transpose(int [][] arr){
        int n = arr.length;
        for(int i = 0; i<n ; i++){         //transpose the whole matrix--to get orginal matrix
            for(int j = i; j<n; j++){      //j=i transpose the upper half matrix
                int tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }
    }
    
    public static void reverse1D(int [] arr){
        int li = 0;
        int ri = arr.length-1;
        while(li<=ri){
            int t = arr[li];
            arr[li] = arr[ri];
            arr[ri] = t;
            li++;   //left index
            ri--;   //right index
        }
        
    }
    
    public static void reverse(int [][] arr){
        int n = arr.length;
       //abstraction-for each loop lia
        for(int [] d : arr)    //for every single 1D array present in 2D array -reverse 1D array
            reverse1D(d);

        
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int[n][n];
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        // 2 steps
        // 1. Transpose
        // 2. Reverse each row
        
        transpose(arr);
        reverse(arr);
        display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

//====================================================
public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    // 2 steps

    // 1. Transpose
    for (int i = 0; i < n ; i++) {     //transpose the whole matrix--to get orginal matrix
      for (int j = i; j < n; j++) {  //j=i transpose the upper half matrix
        int tmp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = tmp;
      }
    }
      
    // 2. Reverse each row
    for (int i = 0; i < n ; i++) {
      int li = 0; //left index 
      int ri = n - 1;  // right index

      while (li <= ri) {
        int tmp = arr[i][li];
        arr[i][li] = arr[i][ri];
        arr[i][ri] = tmp;

        li++;
        ri--;
      }
    }
    display(arr);
  }

  public static void display(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
