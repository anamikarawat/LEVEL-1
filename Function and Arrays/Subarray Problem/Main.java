import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
     Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();      //n = arr.length
    int [] arr = new int[n];
    
    for(int i = 0; i<n; i++){
        arr[i] = scn.nextInt();     //10 20 30
    }
    //input part done
    
    // 1. start(i) vala loop travel karne k lea
    // 2. end(j) vala loop i se shuru hoga or vo bhi travel karne k lea
    // 3. k vala loop start to end(i to j) tak sare values print karne k lea
    
    for(int start = 0; start<n; start++){
        for(int end = start; end < n; end++){
            for(int k = start; k<=end; k++){
                System.out.print(arr[k] + "\t");
            }
            System.out.println(); // to print in next line
        }
    }
 }
}
