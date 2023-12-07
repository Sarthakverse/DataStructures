package patterns;
//GOOD QUESTION
import java.util.Scanner;
//            1
//            1    1
//            1    2    1
//            1    3    3   1
//            1    4    6   4   1
//            1    5    10  10  5   1
public class Pattern13 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();

        for(int i =0 ; i<n ;i++)
        {
            int icj = 1;
            for(int j=0; j<=i ;j++)
            {
               System.out.print(icj+" ");
               int icjp = (icj * (i-j))/(j+1); //logic of permutation and combination
                icj = icjp;
            }
            System.out.println();
        }

    }
}
