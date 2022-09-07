import java.io.*;
import java.util.*;

public class Main {

  public static String solution(String str) {

    StringBuilder sb = new StringBuilder();
    // StringBuilder use kiya kyuki append karne par stringbuilder better perform karta h rather than string
    sb.append(str.charAt(0));//0th char phele hii dal diya
    //append 2 string ko add karta h fir print karta h
    for (int i = 1; i < str.length(); i++) {
      //abecd = a1b3e-2c1d om the basis of ascii value a =97,b=98,c=99 and so on
      char curr = str.charAt(i);// b is curr
      char prev = str.charAt(i - 1); // a is prev
      int diff = curr - prev; //b-a = 1

      sb.append(diff);  //add the difference
      sb.append(curr); //add next character
    }
    return sb.toString(); //convert stringbuilder to string
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(solution(str));
  }

}
