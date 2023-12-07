package patterns;

import java.util.Scanner;
//        1               1
//        1 2           2 1
//        1 2 3       3 2 1
//        1 2 3 4   4 3 2 1
//        1 2 3 4 5 4 3 2 1
//   for n = 5
public class Pattern16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int stars = 1;
        int spaces = 2*n-3;
        int val = 1;
        for(int i =0 ;i<n ;i++)
        {
            if(i!=n-1){
            for(int j=0 ; j<stars ;j++){
              System.out.print(val+" ");
              val++;

            }
            }
            for(int j=0 ; j<spaces ;j++)
            {
                System.out.print("  ");
            }
            val--;
            if(i==n-1){
                for(int j=0 ; j<2*n-1 ; j++)
                {
                    if(j<=(2*n-1)/2){
                        val++;
                        System.out.print(val+" ");

                    }else{
                        val--;
                        System.out.print(val+" ");

                    }

                }
            }else{
                for(int j=0 ;j<stars ;j++)
                {
                    System.out.print(val+" ");
                    val--;
                }
            }

            System.out.println();
            val=1;
            stars++;
            spaces = spaces-2;
        }
    }
}
