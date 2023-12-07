package patterns;

import java.util.Scanner;

//        *  *  *  *  *  *  *
//           *           *
//              *     *
//                 *
//              *  *  *
//           *  *  *  *  *
//        *  *  *  *  *  *  *
public class Pattern18 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int spaces = 0;
        int stars = n;
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<spaces ; j++){
                System.out.print("   ");
            }
            for(int j=0 ; j<stars ; j++)
            {
                if(i>0 && i<n/2)
                {
                   if(j==0 || j==stars-1){
                       System.out.print("*  ");
                   }else{
                       System.out.print("   ");
                   }
                }else{
                    System.out.print("*  ");
                }

            }

            if(i< n/2){
                spaces++;
                stars -= 2;
            }
            else{
                spaces--;
                stars +=2;
            }
            System.out.println();
        }
    }
}
