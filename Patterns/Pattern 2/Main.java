import java.util.*;

public class Main {

     public static void pattern2(int n){
        int nsp =0 , nst= n;
        for(int r =1; r<= n; r++){
           for (int csp = 1; csp <=nsp; csp++)
           System.out.print("\t");

           for (int cst = 1; cst<=nst; cst++)
           System.out.print("*\t");
 
           
           nst--;
           System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern2(n);
    }
}

//  public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//        for(int i=n; i>=1; i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
       
//     }
