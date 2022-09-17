import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();   //count of elements
    int [] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }

    int x = scn.nextInt();
    int li = lastIndex(arr, 0, x);       //x=search
    System.out.println(li);
  }

  public static int lastIndex(int[] arr, int idx, int x) {
    if (idx == arr.length) {
      return -1;
    }
    //last index in smaller array = liisa
    
    //In this we are using Backtracking , jisea phele array k end tak travel hoga uske baad piche se atea hue check ho raha h. Is the X=data is available or not.
    int liisa = lastIndex(arr, idx + 1, x);
    if (liisa == -1) {
      // liisa -1 means humne idx+1 se end tak check kiya or humea X nhi mila
      if (arr[idx] == x) {
      //ab agar humea arr[idx] par milta h X , which is possible ki idx+1 par nhi mila but first idx par milgya so we will print that idx else -1
        return idx;
      } else {
        return -1;
      }
    } else {
     //or agar idx+1 se end tak kahi par X milta h toh print that idx 
      return liisa;
    }

  }

}
