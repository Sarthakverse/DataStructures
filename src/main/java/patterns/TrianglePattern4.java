package patterns;

//*****
// ****
//  ***
//   **
//    *
import java.util.Scanner;

public class TrianglePattern4 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();

        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<n ;j++)
            {
                if(j>=i){
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
