package patterns;

import java.util.Scanner;
//           1
//         2 3 2
//       3 4 5 4 3
//         2 3 2
//           1
public class Pattern15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n  = s.nextInt();
        int spaces =(n/2)+1;
        int stars = 1;
        int val = 1;
        for(int i =0 ;i<=n ;i++)
        {
            for(int j =0 ;j<spaces ;j++)
            {
                System.out.print("  ");
            }
            int colValue = val;
            for(int j=0 ;j<stars ; j++)
            {
                System.out.print(colValue+" ");
                if(j<stars/2) colValue++;
                else colValue--;
            }
            System.out.println();
            if(i<n/2){
                spaces--;
                stars = stars+2;
                val++;
            }else{
                spaces++;
                stars=stars-2;
                val--;
            }
        }
    }
}
