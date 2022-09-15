import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int A = scn.nextInt();
       int B = scn.nextInt();
       int C = scn.nextInt();
        toh(n,A,B,C);
    }

    public static void toh(int n, int A, int B, int C){
        if(n==0){
            return;
        }
        toh(n-1,A,C,B); //move n-1 disk from A to C using B
        System.out.println(n + "[" + A + " -> " + B + "]");
        toh(n-1,C,B,A); //move n-1 disk from C to B using A
    }

}
