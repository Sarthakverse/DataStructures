package patterns;

import java.util.Scanner;

//        *   *   *       *
//                *       *
//        *   *   *   *   *
//        *       *
//        *       *   *   *
public class Pattern19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i=0 ;i<n ;i++)
        {
            for(int j =0 ; j<n ;j++)
            {
               if(i==0){
                   if(j==n-1 || j<=n/2){
                       System.out.print("* ");
                   } else{
                       System.out.print("  ");
                   }
               }

               else if(i<n/2){
                   if(j==n/2 || j==n-1){
                       System.out.print("* ");
                   } else{
                       System.out.print("  ");
                   }
               }
               else if(i==n/2){
                   System.out.print("* ");
               }
               else if(i>n/2 && i<n-1){
                   if(j==0 || j==n/2){
                       System.out.print("* ");
                   } else{
                       System.out.print("  ");
                   }
               }
               else{
                   if(j==0 || j>=n/2){
                       System.out.print("* ");
                   }else{
                       System.out.print("  ");
                   }
               }
            }
            System.out.println();
        }
    }
}
