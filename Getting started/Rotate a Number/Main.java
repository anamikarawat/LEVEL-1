import java.util.*;
   
   public class Main{

     public static int CoutDigitOfNumber(int num){
       int count =0;
       while(num != 0){
         num /=10;
         count++;
       }
       return count;
     }

     public static int rotateNumber( int num , int r){
       int length = CoutDigitOfNumber(num);

       r = ( r % length + length) % length;//formula
       int a = num / (int) Math.pow(10,r);
       int b = num % (int) Math.pow(10,r);
       
       return(b * (int) Math.pow(10, length - r) + a);
     }
   
   public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), r = scn.nextInt();  

     int ans = rotateNumber(n,r);
     System.out.println(ans);
    }
}


// public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
//       int n = scn.nextInt(), k = scn.nextInt();  
      
//       int temp = n ;
//       int nod = 0 ; //number of digit
//       while(temp>0){
//           temp = temp/10;//decrease the size of the digit
//           nod++; //increase the count of the digit
//       }
//       //suppose we find nod = 5 and k=8 then k=k%nod=3 or if k=-3 then k=k+nod=5-3=2
//       k = k % nod;
//       if(k < 0){
//           k = k+ nod;
//       }
      
//       int div = 1;
//       int mult =1 ;
//       for(int i =1; i<=nod; i++){
//           if(i<=k){
//               div= div*10;
//           }else{
//               mult = mult *10;
//           }
//       }
      
//       int quotient = n / div;
//       int remainder = n%div;
      
//      int ans = remainder*mult + quotient;
//      System.out.println(ans);
//     }
