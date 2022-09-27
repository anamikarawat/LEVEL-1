import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
        
      String str = scn.next();
      ArrayList<String> res = gss(str);
        //gss = get subsequence
      System.out.println(res); //res = result
    }

    public static ArrayList<String> gss(String str) {
        //base case
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
            
        }
        
        //faith = bc-> [" " , "c" , "b" , "bc" ]
        //expectation = abc -> [" " , "c" , "b" , "bc" , "a" , "ac" ,"ab" ,"abc" ]
        char ch = str.charAt(0);        //a
        String ros = str.substring(1);      //bc
        //ros = rest of string
        
        ArrayList<String> recAns = gss(ros); //faith
        //recAns = recursion answer
        
        ArrayList<String> myAns = new ArrayList<>(); //expectation
        
       
        for(String ele : recAns){
            //[" " , "c" , "b" , "bc" ]
            myAns.add(ele); //nothing to add
           
        }
        
         for(String ele : recAns){
            myAns.add(ch + ele); // add first character
             // ["a" , "ac" ,"ab" ,"abc" ]
        }
        
        return myAns;
        
    }
}
