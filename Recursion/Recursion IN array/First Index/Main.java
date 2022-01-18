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

        int d = scn.nextInt();
        int fi = firstIndex(arr,0, d);        //d=data
        System.out.println(fi);  
    }

    public static int firstIndex(int[] arr, int idx, int x){
       if(idx == arr.length){
           return -1;

       }
//       int fiisa = firstIndex(arr, idx +1,x);
//       if(arr[idx]==x){
//         return idx;
//         }else{
//     return fiisa;
// }
if(arr[idx] ==x){
    return idx;
}else{
    int fiisa = firstIndex(arr,idx+1,x);
    return fiisa;
}

       
    }

}