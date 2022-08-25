import java.util.*;
  
  public class Main{
//  Pythagorean Triplet -> right angle triangle -> P^2 + B^2 == H^2 as ( 5^2 + 12^2 == 13^2 )

    public static boolean pythagoreanTriplet(int a, int b, int c){
        if(a*a == b*b + c*c) return true;
        else if(b*b == a*a + c*c) return true ;
        else if(c*c == b*b + a*a) return true ;
        else return false;
    }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a= scn.nextInt(), b= scn.nextInt(),c= scn.nextInt();
     boolean ans = pythagoreanTriplet(a,b,c);
     System.out.println(ans);
   }
  }
