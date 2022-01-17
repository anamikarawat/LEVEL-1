import java.io.*;
import java.util.*;

public class Main {
    
    static String [] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};     //global array
    
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(getKPC(s));
       // ArrayList<String> words = getKPC(str);
       //System.out.println(words);
    }

    public static ArrayList<String> getKPC(String str) {
       if(str.length() == 0){
           ArrayList<String> base = new ArrayList<>();
           base.add("");
           return base;
       }
       //573
       char ch = str.charAt(0);      //5 alag kardia
       String ros = str.substring(1);        //73 alag kardia
       
       ArrayList<String> recAns = getKPC(ros);    //get 6 words of 73
       ArrayList<String> myAns = new ArrayList<>();  //get 24 words of 573
       
       int idx = ch-'0';
       
       String code = codes[idx];
       
       
       
       for(int i = 0; i<code.length(); i++){
           char newChar = code.charAt(i);
           for(String ele : recAns){
               myAns.add(newChar + ele);
           }
           
       }
       
       return myAns;
       
       
       
       
       
    }

}