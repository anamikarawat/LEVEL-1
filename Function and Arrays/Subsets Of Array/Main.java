import java.io.*;
import java.util.*;

public class Main{
public static void subset(int [] arr){
    //total  -- 2^n
    //total number of subset print
    //convert to decimal and on basis of rem. I will print - or val;
    int n = arr.length;    
    int total = (int)Math.pow(2,n);  
    for(int i = 0; i<total; i++){
        // i == 0 --> 0 0 0
        String str = "";
        int temp = i;
        for(int j = n-1; j>=0 ; j--){
            int r = temp % 2;
            temp = temp/2;        
            if(r == 0){
                str = "-\t" + str;
            }
            else{
                str = arr[j] + "\t" + str;
            }      
        }   
        System.out.println(str);
    }
}
public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for(int i = 0 ; i<n; i++){
        arr[i]=scn.nextInt();
    }
    subset(arr);
 }
}

//==========================================================
 public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for (int i = 0 ; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    //total subset --> 2^n
    //total number of subset print
    //convert decimal to binary and on basis of rem. I will print - or val;

    int s = arr.length;
    int total = (int)Math.pow(2, s);
    for (int i = 0; i < total; i++) {
      //convert i to binary and use 0's and 1's to know if to print the element or not

      
      String str = "";
      int temp = i; //temp use eslea kiya h kyuki i bahar loop mea bhi use ho raha h. So if we directly use the i toh answer galat print hoga
      for (int j = n - 1; j >= 0 ; j--) { //loop ulta kyuki hume last bit phele print karni h like 110 in example of 6
        //how to make decimal to binary -> dividing by 2 and giving the remainder
        int r = temp % 2;
        temp = temp / 2;
        if (r == 0) {
          //agar remainder 0 hai toh print - else print the value
          str = "-\t" + str;
        }
        else {
          str = arr[j] + "\t" + str;
        }
      }
      System.out.println(str);
    }
  }
