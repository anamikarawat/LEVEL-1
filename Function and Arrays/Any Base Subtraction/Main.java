import java.util.*;
  
  public class Main{
  
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int base = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(base, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int base, int n, int m){
      
     int ans = 0 , pow =1, borrow =0;
     while( m != 0){
       int sub = borrow + m%10 - n%10;
       n /=10;
       m /= 10;
    
   
     if (sub < 0) {
        sub += base;
        borrow = -1;
      } else {
        borrow = 0;
      }
       
     ans += sub*pow;
      pow *=10;
    }
      return ans;
   
    }
  }
