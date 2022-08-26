import java.util.*;
public class Main{

    public static void pattern13(int rows){
        for(int n=0; n< rows; n++){
            int val=1;
            for (int r=0; r<= n; r++){
                if(r!=n)
                System.out.print(val + "\t");
                else{
                    System.out.print(val); 
                }
                val = ((n-r) * val) / (r+1);
            
            }
            System.out.println();
        }
    }

    
   public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern13(n);
    }
}

// public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         for(int r =0; r<n; r++){ //for rows
//             int val=1;
//             for (int c=0; c<=r; c++){//for columns
              
//                 System.out.print(val + "\t");
//                 val = ((r-c) * val) / (c+1);
               
//             }
//             System.out.println();
//         }
//     }
