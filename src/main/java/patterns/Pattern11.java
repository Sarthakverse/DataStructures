package patterns;

import java.util.Scanner;

//        1
//        2 3
//        4 5 6
//        7 8 9 10
public class Pattern11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int count =0;
        for(int i =0 ; i<n; i++){
            for(int j=0 ; j<=i ;j++)
            {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
