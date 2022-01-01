import java.util.*;

public class Main {

   public static void pattern(int n){
        int nsp = 0 , nst= n;
        for(int r =1; r<= n; r++){    //rows
         
             for(int c=1; c<=nsp; c++)
             {  //columns 
                 System.out.print("\t");
             }

             for( int c=1; c<=nst; c++)
             {
                 if(r>1 && r<=n/2 && c>1 && c<nst)
                 {
                 System.out.print("\t");
                 }
                 else{
                      System.out.print("*\t");
                 }
                 
             }

           if( r<=n/2){  //row = 1,2,3
               nst -=2;
               nsp ++;
           }else{
               nst+=2;
               nsp --;
           }
           
           System.out.println();
        }
    }
  public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern(n);
    }
   
}
