import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		
		   for (int i = 0 ; i < str.length(); i++) {
        for (int j = i + 1; j <= str.length(); j++) {
        // i -> starting point of substring, j-> ending point of substring
        if (isPalindrome(str.substring(i, j))) {
          System.out.println(str.substring(i, j));

          //int n = s.length;
          //for(int st=0; st<n; st++){
           //   for(int end = st; end<n;end++) {
             //     String subS= s.substring(st,end+1);
              //    if(ispalindrome(subS)== true)
              //    System.out.println(subS);
            //  }
           //  }

        }
      }
    }
  }

  public static boolean isPalindrome(String str) {
    int i = 0, j = str.length() - 1;
    while (i <= j) {
      if (str.charAt(i) != str.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
	

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}