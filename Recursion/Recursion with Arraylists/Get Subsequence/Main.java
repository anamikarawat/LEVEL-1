import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      String str = scn.next();
      ArrayList<String> res = gss(str);
      System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
            
        }
        
        
        char ch = str.charAt(0);        //a
        String ros = str.substring(1);      //bc
        
        ArrayList<String> recAns = gss(ros);
        ArrayList<String> myAns = new ArrayList<>(); 
        
       
        for(String ele : recAns){
            myAns.add(ele);
        }
        
         for(String ele : recAns){
            myAns.add(ch+ele);
        }
        
        return myAns;
        
    }
}