import java.util.*;

public class Main{

    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int base = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(base, n1, n2);
    System.out.println(d);
    }

  public static int anyBaseAddition(int b, int n, int m){
           
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

 public static int multiplyDigitWithNumber(int base, int digit, int n){
     
     int ans =0, carry =0, pow =1;
     while(n !=0  || carry !=0){
         int prod =carry + (n%10)*digit;
         n /=10;

         carry = prod/base;
         prod %= base;
         
         ans += prod*pow;
         pow *= 10;
     }
     return ans;
 }
   public static int getProduct(int b, int n, int m){
       int ans =0, pow=1;
       while(m !=0){
           int digitMultiply= multiplyDigitWithNumber(b, m%10,n);

           m /=10;

           ans = anyBaseAddition(b, digitMultiply*pow,ans);
           pow *=10;
       }
       return ans;
   }


}