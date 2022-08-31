import java.io.*;
import java.util.*;
public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();
    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
   public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }    
    public static void reverse(int [] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            swap(arr, i, j);        
            i++;
            j--;
        }
    }
//original-> 10 20 30 40 50
//reverse-> 50 40 30 20 10
public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt(); // input the array
        }        
        reverse(arr);
        display(arr);     
    }
}

//=========================================================================
public static void reverse(int [] arr) {
    int i = 0;
    int j = arr.length - 1;
    while (i <= j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }
