import java.io.*;
import java.util.*;

public class Main {

  public static String compression1(String str) {
    // write your code here
    String ans = "" + str.charAt(0); //ans k starting mea string ka 0th character add kardege
    for (int i = 1 ; i < str.length(); i++) { //loop 1st char to last
      char curr = str.charAt(i);
      char prev = str.charAt(i - 1);
      //aaabbccc= abc
      if (curr != prev)
        ans += curr;
    }
    return ans;
  }

  public static String compression2(String str) {
    // write your code here
    String ans = "" + str.charAt(0); //charAt se character milega but humea toh substring chahiye eslea hum use karege " "
    int count = 1;
    for (int i = 1 ; i < str.length(); i++) {

      char curr = str.charAt(i);
      char prev = str.charAt(i - 1);
      //aaabbccc= a3b2c3
      if (curr == prev) {
        count++;
      }
      else {
        if (count > 1) {
          //agar current previous k equal nhi hai and count>1 hai toh hum phele count add karege answer mea then count ko vapas se 1 kardege for next character
          ans += count;
          count = 1;
        }

        ans += curr; //or new character add kardege answer mea
      }
    }
    if (count > 1) { //edge case- last char mea count add karvane k lea
      ans += count;
    }
    return ans;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(compression1(str));
    System.out.println(compression2(str));
  }

}
