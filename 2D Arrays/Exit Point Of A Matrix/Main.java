import java.io.*;
import java.util.*;

public class Main {
    
    public static Scanner scn = new Scanner(System.in);
    public static void input(int [][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
    
    public static void exitPoint(int [][] arr){
        //east 0. south 1, west = 2, north = 3
        
        int dir = 0;
        
        //initially top left 0,0
        int i = 0;
        int j = 0;
        int n = arr.length;
        int m = arr[0].length;
        
        while(true){
            dir += arr[i][j];
            dir %= 4;
            
            if(dir == 0){
                j++;
            }
            else if(dir == 1){
                i++;
            }
            else if(dir == 2){
                j--;
            }
            else{
                //dir == 3
                i--;
            }
            
            if( i < 0 || j < 0 || i >= n || j >= m){
                break;
            }
            
        }
        
        //from which cell I have gone out of grid
        
        if(i < 0){
            i++;
        }
        else if(i>=n){
            i--;
        }
        else if(j<0){
            j++;
        }
        else if(j >= m){
            j--;
        }
        
        System.out.println(i);
        System.out.println(j);
        
    }
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int [][] arr = new int[n][m];
        
        input(arr);
        
        exitPoint(arr);
    }

}

//=============================================================================================
 public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();

    int [][] arr = new int[n][m];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    //east 0. south 1, west = 2, north = 3

    int dir = 0;

    //initially top left 0,0
    int i = 0;
    int j = 0;

    while (true) {      //i<=j
      dir += arr[i][j]; //dir = 5
      dir %= 4;          //dir = 5%4=1

      if (dir == 0) {//east
        j++;
      }
      else if (dir == 1) {//south
        i++;
      }
      else if (dir == 2) {//west
        j--;
      }
      else {//north
        //dir == 3
        i--;
      }

      //from which cell I have gone out of grid

      //agar hum matrix se out hote hai toh humea answer get karne k lea ek step pichea jana hoga
      if (i < 0) {
        i++;
        break;//matrix se out
      }
      else if (i >= n) {
        i--;
        break;
      }
      else if (j < 0) {
        j++;
        break;
      }
      else if (j >= m) {
        j--;
        break;
      }
    }
    System.out.println(i);
    System.out.println(j);
  }
