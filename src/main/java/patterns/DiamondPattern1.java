package patterns;

import java.util.Scanner;

//       *
//     * * *
//   * * * * *
//     * * *
//       *
public class DiamondPattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int mid = n/2;
        int left = mid;
        int right = mid;
        for(int i =0 ; i<n ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(j>=left && j<=right)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            if (i < mid) {
                left--;
                right++;
            } else {
                left++;
                right--;
            }
        }
    }
}
