package patterns;

import java.util.Scanner;

//               *
//            *     *
//        *             *
//            *     *
//               *
public class Pattern10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int mid = n/2;
        int left = mid;
        int right = mid;
        for(int i=0 ; i<n+1 ; i++)
        {
            if(n%2!=0)
            {
                if(i==n) break;
            }
            for(int j =0 ; j<n+1 ; j++)
            {
                if(j==left || j==right){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            if(i<n/2)
            {
                left--;
                right++;
            }
            else{
                left++;
                right--;
            }
        }

    }
}
