import java.util.*;

public class Main {

    public static void pattern12(int n){
        int nst = 1, a=0, b =1 ;
        for( int r = 1; r <= n; r++){
            for( int cst = 1; cst<= nst; cst++){
                System.out.print( a + "\t");

                int sum = a+b;
                a = b;
                b = sum;

            }
             nst++;
            System.out.println();
            
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern12(n);
    }
}

//  public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int a=0, b =1 ;
//         for( int r = 1; r <= n; r++){
//             for( int c = 1; c<= r; c++){
//                 System.out.print( a + "\t");

//                 int sum = a+b;
//                 a = b;
//                 b = sum;

//             }
           
//             System.out.println();
            
//         }
//     }
