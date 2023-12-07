package patterns;

import java.util.Scanner;
//            *
//            * *
//       * * * * *

//            * *
//            *
public class Pattern17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int spaces = n/2;
        int stars  = 1;
        for(int i=0 ; i<=n ;i++)
        {
         for(int j =0 ; j<spaces ; j++)
         {
             if(i==n/2){
                 System.out.print("* ");
             }else{
                 System.out.print("  ");
             }

         }
         for(int j =0 ; j<stars ; j++)
         {
             System.out.print("* ");
         }
         if(i<n/2)
         {
             stars++;
         }else{
             stars--;
         }
         System.out.println();
        }
    }
}
