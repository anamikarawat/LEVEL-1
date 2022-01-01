import java.util.*;
  
  public class Main{
  
  public static int countDigitOfNumber(int num){
      int count =0;
      while(num != 0){
          num /= 10;
       count++;
      }
      return count;
  }
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n= scn.nextInt();
      int ans = countDigitOfNumber(n);
      System.out.println(ans);
   
   }
  }