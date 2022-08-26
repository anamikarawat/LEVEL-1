import java.util.*;

public class Main {

    public static void pattern11(int n){
        int nst = 1, count = 1;
        for( int r = 1; r <= n; r++){
            for( int cst = 1; cst<= nst; cst++){
                System.out.print( count++ + "\t");
            }

            System.out.println();
            nst++;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern11(n);
    }
}

//  public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int val = 1;
//         for( int r = 1; r <= n; r++){
//             for( int c = 1; c<= r; c++){
//                 System.out.print( val + "\t");
//                  val++;
//             }

//             System.out.println();
           
//         }
//     }
