import java.util.*;

public class Main {

    public static void pattern8(int rows){
        for (int r=1; r <= rows; r++){
            for(int c =1; c<= rows; c++){
                if ( r + c ==rows + 1)
                System.out.print("*\t");
                else
                 System.out.print("\t");
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern8(n);
    }
}
