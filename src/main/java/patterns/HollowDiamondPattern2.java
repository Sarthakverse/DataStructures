package patterns;

import java.util.Scanner;

//    * * *  * * *
//    * *      * *
//    *          *
//    * *      * *
//    * * *  * * *
public class HollowDiamondPattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = n / 2 + 1, sp = 1; // sp = spaces ; st = stars
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= st; j++) //printing stars
            {
                System.out.print("*	");
            }
            for (int j = 1; j <= sp; j++) //printing spacing
            {
                System.out.print("	");
            }
            for (int j = 1; j <= st; j++) //printing stars again
            {
                System.out.print("*	");
            }

            if ( i <= n / 2)
            { st--; //decrementing stars in succeeding lines by 1
                sp+=2; //incrementing spacing in succeeding lines by 2
            }
            else
            {
                st++; //increasing stars in succeeding lines by 1
                sp-=2; //decreasing spacing in succeeding lines by 2  }
                //changing to newline after one complete iteration of loop  }
            }
            System.out.println();
        }


    }
}
