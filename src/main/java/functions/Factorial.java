package functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(factorial(n));

    }
    private static long factorial(int n) {
        long fact = 1;
        for(int i=n ; i>0 ; i--){
            fact = fact*i;
        }
        return fact;
    }
}
