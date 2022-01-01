import java.util.*;
    
  public class Main{

    public static int countDigitOfNumber(int num){
      int count = 0 ;
      while (num !=0){
        num /= 10;
        count++;
      }
      return count;
    }
    public static void digitOfNumber(int num){
      int len = countDigitOfNumber(num) - 1;
      while(len >= 0){
        int digit = num / (int) Math.pow(10, len);
        num = num % (int) Math.pow(10, len);
        System.out.println(digit);
        len--;
      }
    }
    public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      digitOfNumber(n);
    }
  }
   
  