import java.io.*;
import java.util.*;

public class Main {

     public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();   //number of elements
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int max = maxOfArray(arr,0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }

        int misa = maxOfArray(arr, idx+1);       //misa-->max in smaller array
        if(misa > arr[idx]){
            return misa;
        }else{
            return arr[idx];
        }
    }

}