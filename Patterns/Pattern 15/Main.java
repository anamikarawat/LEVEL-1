import java.util.*;

public class Main {

    public static void pattern(int n){
        int nsp = n/2, nst= 1;
        for(int r =1; r <= n; r++){

           for (int csp = 1; csp <=nsp; csp++){
           System.out.print("\t");
           }
            int count = (r <= n/2 +1 ? r: n-r+1);

           for (int cst = 1; cst<=nst; cst++){
           System.out.print( count + "\t");
           count = (cst <= nst/2) ? count+1 : count -1;
           }
           if( r<=n/2){  //row = 1,2
               nsp--;
               nst +=2;
           }else{     //row = 3,4,5
               nsp++;
               nst -=2;
           }
           
           System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern(n);
    }
}
//=======================================================
     1
  2  2  2
3 3  3  3  3
  4  4  4   
      5   
         
  int nsp = n/2, nst= 1;
        int count = 1;
        for(int r =1; r <= n; r++){
           for (int csp = 1; csp <=nsp; csp++){
           System.out.print("\t");
           }
           for (int cst = 1; cst<=nst; cst++){
           System.out.print( count + "\t");
           }
           if( r<=n/2){  //row = 1,2
               nsp--;
               nst +=2;
           }else{     //row = 3,4,5
               nsp++;
               nst -=2;
           }
           count++;
           System.out.println();
        }        

//=============================================================
     1
  2  2  2
3 3  3  3  3
  2  2  2   
      1
   
   int nsp = n/2, nst= 1;
        int count = 1;
        for(int r =1; r <= n; r++){
           for (int csp = 1; csp <=nsp; csp++){
           System.out.print("\t");
           }
           for (int cst = 1; cst<=nst; cst++){
           System.out.print( count + "\t");
           }
           if( r<=n/2){  //row = 1,2
               nsp--;
               nst +=2;
                count++;
           }else{     //row = 3,4,5
               nsp++;
               nst -=2;
                count--;
           }
          
           System.out.println();
        }       
         
//=============================================================
     1
  2  3  4
3 4  5  6  7
  2  3  4   
      1 
  int nsp = n/2, nst= 1;
        int count = 1;  //for row 
        for(int r =1; r <= n; r++){
           for (int csp = 1; csp <=nsp; csp++){
           System.out.print("\t");
           }
           int val = count; // for column 2 3 4; 3 4 5 6 7 ; 2 3 4 
           for (int cst = 1; cst<=nst; cst++){
           System.out.print( val + "\t");
           val++;
           }
           if( r<=n/2){  //row = 1,2
               nsp--;
               nst +=2;
                count++;
           }else{     //row = 3,4,5
               nsp++;
               nst -=2;
                count--;
           }
          
           System.out.println();
        }        
 //=============================================================
     1
  2  3  2
3 4  5  4  3
  2  3  2   
      1     
         
   int nsp = n/2, nst= 1;
        int count = 1;  //for row 
        for(int r =1; r <= n; r++){
           for (int csp = 1; csp <=nsp; csp++){
           System.out.print("\t");
           }
           int val = count; // for column 2 3 4; 3 4 5 6 7 ; 2 3 4 
           for (int cst = 1; cst<=nst; cst++){
           System.out.print( val + "\t");
           
           
             if(cst<=nst/2){ //this will print 2 3 2 ; 3 4 5 4 3; 2 3 2
                val++;  //increase from column
             }else{
                val--;   //decrease from column
             }
          
           }
           if( r<=n/2){  //row = 1,2
               nsp--;
               nst +=2;
                count++;
           }else{     //row = 3,4,5
               nsp++;
               nst -=2;
                count--;
           }
          
           System.out.println();
        }      
