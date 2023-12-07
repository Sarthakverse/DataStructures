package patterns;

import java.util.Scanner;
//        0
//        1 1
//        2 3 5
//        8 13 21 34
public class Pattern12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int a=0;
        int b=1;
        for(int i=0 ;i<n ;i++)
        {
            for(int j=0 ;j<i ;j++){
                System.out.print(a+" ");
                int c= a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}
