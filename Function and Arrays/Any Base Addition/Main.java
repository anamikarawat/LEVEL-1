import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n = scn.nextInt();
      int m = scn.nextInt();
  
      int d = getSum(b, n, m);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n, int m){
      
       int ans = 0, pow =1, carry =0;
       while(n != 0 || m != 0 || carry != 0){
         int sum = carry + n%10 + m%10;
         n /= 10;
         m /= 10;
         
         carry = sum /b;
         sum %= b;

         ans += sum*pow;
         pow *= 10;
       }
       return ans;
   }
  }

//=====for decimal addition===============
         carry = sum /10;
         sum %= 10;
//========= for binary addition===========
        carry = sum /2;
         sum %= 2;
