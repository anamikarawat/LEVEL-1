import java.util.*;

public class Main {

    public static void pattern6(int n){
        if(n%2 ==0)
        n++;  // convert even rows into odd
        int nsp = 1 , nst= (n/2+1);
        for(int r =1; r<= n; r++){
            //star
            for (int cst = 1; cst<=nst; cst++)
           System.out.print("*\t");
           //space
           for (int csp = 1; csp <=nsp; csp++)
           System.out.print("\t");
           //star
           for (int cst = 1; cst<=nst; cst++)
           System.out.print("*\t");
           if( r<=n/2){
               nsp +=2;
               nst--;
           }else{
               nsp -=2;
               nst++;
           }
           
           System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern6(n);
    }
}
