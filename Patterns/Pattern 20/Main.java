import java.util.*;

public class Main {
public static void pattern(int n){
   for (int i = 1; i <= n; i++)
    {
      for (int j = 1; j <= n; j++)
      {
        if ( j == 1 || j == n) //if first or last column
        {
          System.out.print("*\t");
        }
        else if (i > n / 2 && (i == j || i + j == n + 1)) // 2nd half of the diagonal(lower part)
         // diagonal below middle row
        {
          System.out.print("*\t");
        }
        else
        {
          System.out.print("\t");
        }
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
