import java.io.*;
import java.util.*;
public class Main{
public static int [] difference(int [] A, int [] B){
    int borrow = 0;
    int [] ans = new int[B.length];
    int i = A.length-1;
    int j = B.length-1;
    int k = ans.length-1;
     while(j>=0){
        int digit = 0;
        digit += B[j] + borrow;
        if(i >= 0){
            digit -= A[i];
        }
        
        if(digit < 0){
            digit += 10;
            borrow = -1;
        }
        else{
            borrow = 0;
        }
        
        int val = digit % 10;
        
        ans[k] = val;
        i--;
        j--;
        k--;     
    }
    return ans;
}

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    
    int n1 = scn.nextInt();
    int [] A = new int[n1];
    for(int i = 0; i<n1; i++){
        A[i] = scn.nextInt();    
    }
    
        // n2 > n1
    int n2 = scn.nextInt();
    int [] B = new int[n2];
    for(int i = 0; i<n2; i++){
        B[i] = scn.nextInt();
    }
    int [] ans = difference(A,B);
    
    //edge cases
    // 1. first non zero index -- fnzi
    int fnzi = -1;
    for(int i = 0; i<ans.length; i++){
        if(ans[i] != 0){
            fnzi = i;
            break;
        }
    }
    //546-546 = 000
    if(fnzi == -1){
        System.out.println("0");
        return;
    }
    for(int i = fnzi; i<ans.length; i++){
        System.out.println(ans[i]);
    }
 }

}


//============================================================
 public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    int n1 = scn.nextInt();
    int [] A = new int[n1];
    for (int i = 0; i < n1; i++) {
      A[i] = scn.nextInt();
    }

    // n2 > n1
    int n2 = scn.nextInt();
    int [] B = new int[n2];
    for (int i = 0; i < n2; i++) {
      B[i] = scn.nextInt();
    }

    int borrow = 0;
    int [] ans = new int[B.length];
//answer array ka size B k equal hoga kyuki B>A constraint h

    int i = A.length - 1;
    int j = B.length - 1;
    int k = ans.length - 1;
    while (j >= 0) {

      int val = 0;
      //ANSWER = B-A + borrow


//agar A phele khatm ho jata h B se toh A ki place mea 0 rakh dege like=> B - A =1000 - 9
      int Aval = i >= 0 ? A[i] : 0; //esmea A=9 hai, so we will take Aval = 0009

//borrow = 0 , B=1000 , A=0009
//B+borrow-A =0 + 0 - 9 = -9 then we add 10 = -9+10= 1 and borrow -1
//then  B+borrow-A=0-1-0=-1 then we add 10=-1+10=9 and borrow -1 and so on.... answer=0991

      if (B[j] + borrow >= Aval) {
        val = B[j] + borrow - Aval;
        borrow = 0;
      } else {
        val = B[j] + borrow + 10 - Aval;
        borrow = -1;
      }

      ans[k] = val;
      i--;
      j--;
      k--;
    }

    //edge cases
    //answer = 0991 but we have to print= 991
    int idx = 0;
    while (idx < ans.length) {//end tak loop chalega
      if (ans[idx] == 0) {//agar answer ke index mea VALUE= 0 hai toh idx++
        idx++;
      } else {
        break;
        //now break kar k value mea agea k zero remove kar k print kardo
      }
    }

    while (idx < ans.length) {
      System.out.println(ans[idx]);
      idx++;
    }
  }
