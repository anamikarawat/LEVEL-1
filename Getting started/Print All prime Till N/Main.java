import java.util.*;

public class Main{
    public static boolean isPrime(int num){
        for(int i =2; i*i<= num; i++){
            if((num %i) ==0)
            return false;
        }
        return true;
    }

    
    public static void main(String[] args){

      Scanner scn = new Scanner (System.in);
      int low = scn.nextInt(), high = scn.nextInt();

      for(int num = low; num <= high; num++){
          if(isPrime(num)){
              System.out.println(num);
          }
      }  
    } 
       
}