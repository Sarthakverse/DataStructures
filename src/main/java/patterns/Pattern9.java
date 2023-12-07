package patterns;

import java.util.Scanner;
//        *         *
//          *     *
//             *
//          *     *
//        *         *
public class Pattern9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // n must be odd
        for(int i =0 ; i<n ; i++)
        {
            for(int j=0 ; j<n ;j++)
            {
                    if(j==i || j==n-i-1)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }

            }
            System.out.println();
        }
    }
}
