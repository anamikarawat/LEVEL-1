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