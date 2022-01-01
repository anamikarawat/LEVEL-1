import java.util.*;

public class Main {

    public static void pattern(int n){
        int nsp = n/2, nst= 1;
        for(int r =1; r <= n; r++){

           for (int csp = 1; csp <=nsp; csp++){
           System.out.print("\t");
           }
            int count = (r <= n/2 +1 ? r: n-r+1);

           for (int cst = 1; cst<=nst; cst++){
           System.out.print( count + "\t");
           count = (cst <= nst/2) ? count+1 : count -1;
           }
           if( r<=n/2){  //row = 1,2
               nsp--;
               nst +=2;
           }else{     //row = 3,4,5
               nsp++;
               nst -=2;
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