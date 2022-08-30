import java.io.*;
import java.util.*;

public class Main{

public static void sumOfArrays(int [] A, int [] B){
    int n1 = A.length;
    int n2 = B.length;
    
    int carry = 0;
    
    int size =( n1 > n2) ? n1 : n2;
    int [] ans = new int[size];
    
    int i = n1-1;
    int j = n2-1;   //B.length-1
    int k = ans.length-1;
    
    while(k>=0){
        int sum = 0;
        sum += carry;
        
        if(i>=0){
            sum += A[i];
        }
        
        if(j>=0){
            sum += B[j];
        }
        
        int val = sum%10;
        carry = sum/10;
        
        ans[k] = val;
        i--;
        j--;
        k--;
        
    }
    
    //print
    if(carry != 0){
        System.out.println(carry);
    }
    
    for(int ele : ans){
        System.out.println(ele);
    }
    
}


public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int [] A = new int[n1];
    for(int i = 0; i<n1; i++){
        A[i] = scn.nextInt();
    }
    
    int n2 = scn.nextInt();
    int [] B = new int[n2];
    for(int i = 0; i<n2; i++){
        B[i] = scn.nextInt();
    }
    
    sumOfArrays(A,B);
 }

}


//======================================================================================
 public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    //taking input from the user
    int n1 = scn.nextInt();
    int [] A = new int[n1];
    for (int i = 0; i < n1; i++) {
      A[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int [] B = new int[n2];
    for (int i = 0; i < n2; i++) {
      B[i] = scn.nextInt();
    }

    int carry = 0;

    int size = ( n1 > n2) ? n1 : n2;
    int [] ans = new int[size];

    //we start adding from last index so i , j , k values are so on........
    int i = n1 - 1; //A.length-1
    int j = n2 - 1; //B.length-1
    int k = ans.length - 1; //k is index of answer array

    //computation
    while (k >= 0) { // loop ko ulta chalaya

      int sum = carry; // carry ko recevie kiya sum mea

      if (i >= 0) {
        sum += A[i];
      }

      if (j >= 0) {
        sum += B[j];
      }

      int val = sum % 10;
      carry = sum / 10;

      ans[k] = val;
      i--;
      j--;
      k--;

    }

    //print
    if (carry != 0) {
//agar last mea koi value bachi hai carry mea toh phele usse print karege like 999+1=1000 mea 1.
      System.out.println(carry);
    }

    for (int ele : ans) {
// yeh loop values print kar dega jo add hoke answer array mea ayii hai na ki index/position
      System.out.println(ele);
    }

  }
