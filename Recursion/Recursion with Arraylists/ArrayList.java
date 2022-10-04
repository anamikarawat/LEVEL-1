import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    //string
    String str = "hello";
    System.out.println(str);
    // char ch = str.charAt(0); //1st idx

    for (int i = 0; i < str.length(); i++) {  //str.length()
      char ch = str.charAt(i);
      System.out.println(ch);
    }
//substring
    String ss = str.substring(2, 4);
    System.out.println(ss);
//===================================================================
//arraylist ka size grow hota h
    ArrayList<Integer> list = new ArrayList<>();
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
    System.out.println(list + "->" + list.size());

    for (int val : list) {
      System.out.println(val);
    }

    for (int i = 0; i < list.size(); i++) {
      int val = list.get(i);
      System.out.println(val);
    }

    list.set(3, 300);
    System.out.println(list + "->" + list.size());

    list.add(3, 3000);
    System.out.println(list + "->" + list.size());
    //answer->[20, 30, 40, 50]->4
// 20
// 30
// 40
// 50
// [20, 30, 40, 300]->4
// [20, 30, 40, 3000, 300]->5
  }
}
