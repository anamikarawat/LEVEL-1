import java.util.*;

public class Main{

public static int InverseOfNumber(int num){
    int lastIndex = 1, result = 0;
    while( num != 0){
        int lastDigit = num % 10;
        num /=10;

        result += lastIndex * (int)Math.pow(10, lastDigit - 1);
        lastIndex++;
    }
    return result;
}
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int ans = InverseOfNumber(n);
    System.out.println(ans);
 }
}

// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int n = scn.nextInt();
   
//    int inverse = 0; //inverse number
//    int op =1;  //original position
//    while(n != 0){
//        int od = n %10; //original digit
//// interchange inverse digit -> original position and inverse position-> original digit
//        int id = op ; //inverse digit
//        int ip = od ; //inverse position
       
       
//        inverse += id * (int)Math.pow(10, ip-1); //add all the numbers
       
//        n =n/10; // to decrease/short the number
//        op++; // original position 1,2, 3.....
//    }
//    System.out.println(inverse);
//  }
