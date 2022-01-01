import java.util.*;

public class Main {

    public static void pattern16(int n){
        
        int nsp = 2*n -3 , nst= 1;
        for(int r =1; r<= n; r++){
            
           int count = 1;
            for (int cst = 1; cst<=nst; cst++){
           System.out.print( count++ + "\t");
            }
           //space
           for (int csp = 1; csp <=nsp; csp++){
           System.out.print("\t");
           }
           if (r ==n ){
           nst--;
           count--;
           }
           for (int cst = 1; cst<=nst; cst++){
           System.out.print(--count + "\t");
           }
          
               nsp -=2;
               nst++;
          
           
           System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern16(n);
    }
}