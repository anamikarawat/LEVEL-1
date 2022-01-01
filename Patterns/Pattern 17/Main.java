import java.util.*;

public class Main {

    public static void pattern17(int n){
        int nsp = n/2 , nst= 1;
        for(int r =1; r<= n; r++){    //rows
         {
             for(int c=1; c<=nsp; c++)  //columns 
             if(r==n/2 +1)             //for middle line
             {
                 System.out.print("*\t");
             }else{
                  System.out.print("\t");
             }
         }
         for(int c=1; c<=nst; c++)            //columns
           System.out.print("*\t");

           if( r<=n/2){  //row = 1,2,3
               nst++;
           }else{
               nst--;
           }
           
           System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern17(n);
    }
}
