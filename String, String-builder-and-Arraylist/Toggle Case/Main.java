import java.io.*;
import java.util.*;


public class Main {

	public static String toggleCase(String str){
		
 StringBuilder sb = new StringBuilder(str);
 //StringBuilder ans = new StringBuilder(str);
    for (int i = 0 ; i < sb.length() ; i++) {
      char ch = sb.charAt(i);
      //  for (int i = 0 ; i < str.length() ; i++) {
      // char ch = str.charAt(i);

      if (ch >= 'A' && ch <= 'Z') {
        // convert to lowerCase
        char lc = ( char ) ( ch - 'A' + 'a' );
        sb.setCharAt(i, lc);
        //ans.append(lc);
      }
      else if (ch >= 'a' && ch <= 'z') {
        // convert to UpperCase
        char uc = (char) (ch - 'a' + 'A');
        sb.setCharAt(i, uc);
         //ans.append(uc);
      }
    }
    return sb.toString();
   // return ans.toString();    --->convert stringbuilder to string
  }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}