import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // number of elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        displayArrReverse(arr, 0); // calling an array
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if (idx == arr.length) {
            return;

        }
        displayArrReverse(arr, idx + 1); // backtracking
        System.out.println(arr[idx]);
    }

}
