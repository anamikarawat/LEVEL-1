import java.util.*;
   
   public class Main{

     public static int CoutDigitOfNumber(int num){
       int count =0;
       while(num != 0){
         num /=10;
         count++;
       }
       return count;
     }

     public static int rotateNumber( int num , int r){
       int length = CoutDigitOfNumber(num);

       r = ( r % length + length) % length;//formula
       int a = num / (int) Math.pow(10,r);
       int b = num % (int) Math.pow(10,r);
       
       return(b * (int) Math.pow(10, length - r) + a);
     }
   
   public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), r = scn.nextInt();  

     int ans = rotateNumber(n,r);
     System.out.println(ans);
    }
}
