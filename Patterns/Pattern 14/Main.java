import java.util.*;

public class Main {
    public static void printTable(int num){
        for (int i= 1; i <= 10; i++){
            System.out.println( num + " * " + i + " = " + (num * i));
        }
    }
   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printTable(n);
    }
}
