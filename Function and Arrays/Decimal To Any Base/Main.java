import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       int pow = 1, ans = 0;
       while(n !=0){
         // Decimal to any base
         int rem = n%b;
         n /= b;
         ans += rem*pow;
         pow *=10;
         
       }
       return ans;
   }
  }
//=======================================Decimal to Binary=================
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
     
      int dn = decimalToBinary(n);
      System.out.println(dn);
   }
  
  public static int decimalToBinary(int n){
       int pow = 1, ans = 0;
       while(n !=0){
        //only these lines are change 
         int rem = n%2;
         n /= 2;
         
         ans += rem*pow;
         pow *=10;
       }
       return ans;
   }
  }
//====================================Binary to Decimal======================
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
     
      int dn = BinaryToDecimal(n);
      System.out.println(dn);
   }
  
  public static int BinaryToDecimal(int n){
       int pow = 1, ans = 0;
       while(n !=0){
       //only these lines are change 
         int rem = n%10;  
         n /= 10;
         ans += rem*pow;
         pow *=2;
         
       }
       return ans;
   }
  }
