import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    ArrayList<Integer> list = new ArrayList<>(); //declare
    System.out.println(list + "-> " + list.size());
    //list.size for size
    
    //add -> size increased
    list.add(10);
    list.add(20);
    list.add(30);
    System.out.println(list + " -> " + list.size());
    
    //insert(index, value)
    list.add(1,1000);
    System.out.println(list + " -> " + list.size());
    
    //get
    int val = list.get(1);
    System.out.println(list + " -> " + list.size());
    
    //set
    list.set(1,2000);
    System.out.println(list + " -> " + list.size());
    
    //delete
    list.remove(1);
    System.out.println(list + " -> " + list.size());
    
    //string in arraylist
    ArrayList<String> l2 = new ArrayList<>();
    l2.add("Hello");
    l2.add("abc");
    l2.add("aadfg");
    System.out.println(l2 + " -> " + l2.size());
    
    //loop
//     for(int i=0;i<list.size();i++){
//       int value = list.get(i);
//       System.out.println(value);
//     }
    
    for(int value: list){
      System.out.println(value);
    }
    
    System.out.println(list);//print content in box [ ]
    
  }
}
  //arraylist ka size ghat sakta h badh sakta hai but essa array mea nhi hota h
  //starting mea size zero hota h arraylist ka
  
//output-
// []-> 0
// [10, 20, 30] -> 3
// [10, 1000, 20, 30] -> 4
// [10, 1000, 20, 30] -> 4
// [10, 2000, 20, 30] -> 4
// [10, 20, 30] -> 3
// [Hello, abc, aadfg] -> 3
// 10
// 20
// 30
// [10, 20, 30]
