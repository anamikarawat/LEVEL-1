import java.io.*;
import java.util.*;

public class Main{

public static int firstIndex(int [] arr, int x){
    int li = 0;    //left index
    int ri = arr.length-1;   //right index
    int fi = -1;          // first index
    
    
    while(li<=ri){
        int mid = (li+ri)/2;
        
        if(arr[mid] == x){
            fi = mid;
            //left me dhundho bcoz firstIndex is always on left
            ri = mid - 1;
            
        }
        else if(arr[mid] > x){
            ri = mid - 1;
        }
        else{
            li = mid + 1;
        }
        
    }
    
    return fi;
    
}

 public static int lastIndex(int [] arr, int x){
   int left = 0;
  int  right = arr.length - 1;
    int li = -1; // last index = li
    while (left <= right) {
      int mid = (left + right) / 2;
      if (x > arr[mid]) {
        left = mid + 1;
      } else if (x < arr[mid]) {
        right = mid - 1;
      } else  {
        li = mid;
        left = mid + 1;
      }
    }
    
    return li;
    
 }

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for(int i = 0; i<n; i++){
        arr[i] = scn.nextInt();
    }
    int x = scn.nextInt();
    int fi = firstIndex(arr,x);
    int li = lastIndex(arr, x);
    
    System.out.println(fi);
    System.out.println(li);
 }

}