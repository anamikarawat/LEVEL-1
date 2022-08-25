import java.util.*;

public class Main {

    public static void pattern1(int n){
        int nsp=0 ,  nst= 1;
        for(int r =1; r<= n; r++){
           for (int csp = 1; csp <=nsp; csp++)
           System.out.print("\t");
            
           for (int cst = 1; cst<=nst; cst++)
           System.out.print("*\t");
 
           
           nst++;
           System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern1(n);
    }
}

//  public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
       
//     }

what is abstraction?
input dekar output par vishwass rakhna
