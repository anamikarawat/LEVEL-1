import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();   //number of elements
    int [] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int d = scn.nextInt();//d=data
    int fi = firstIndex(arr, 0, d);
    System.out.println(fi); //fi = first index
  }

  public static int firstIndex(int[] arr, int idx, int x) {
    if (idx == arr.length) {
      return -1;

    }
//In this we are using Backtracking , jisea phele array k end tak travel hoga uske baad piche se atea hue check ho raha h. Is the X=data is available or not.      
    int fiisa = firstIndex(arr, idx + 1, x);
    if (arr[idx] == x) {
      return idx;
    } else {
      return fiisa;
    }
  }
}

//=======================================================================================================================

// better way and optimize 
// In this code, hum phele se hi compare karte hue agea badh rahe h. phele compare kiya agar same aya toh vo idx return kardo verna agea dhundo
public static int firstIndex(int[] arr, int idx, int x) {
    if (idx == arr.length) {
      return -1;

    }
    if (arr[idx] == x) {
      return idx;
    } else {
      //fiisa = first index in small array
      int fiisa = firstIndex(arr, idx + 1, x);
      return fiisa;
    }
 }
