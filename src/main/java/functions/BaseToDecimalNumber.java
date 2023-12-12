package functions;

import java.util.Scanner;

public class BaseToDecimalNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b = s.nextInt();
        System.out.println(bToD(n,b));

    }

    public static int bToD(int n, int b) {
        int num = 0;
        int power = 0;
        while(n!=0){
            int rem = n%10;
            n= n/10;
            num = (int)(num +Math.pow(b,power++)*rem);
        }
        return num;
    }
}
