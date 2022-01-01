import java.util.*;
   
   public class Main{

       public static void reverseNumber(int num ){
           while (num != 0 ){
               int digit = num % 10;
               num /= 10;
               System.out.println(digit);
           }
       }
   
     public static void main(String[] args) {
     // write your code here  
      Scanner scn = new Scanner (System.in);
      int n = scn.nextInt();
      reverseNumber(n);


    }
}