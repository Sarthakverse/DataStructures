package functions;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b = s.nextInt();

        System.out.println(convertToBaseNumber(n,b));
    }
    public static int convertToBaseNumber(int n , int b){
        int num = 0;
        int power =0;
        while(n!=0){
            int rem = n%b;
            n = n/b;
            num = (int)(num + Math.pow(10,power)*rem);
            power++;
        }
        return num;
    }
}
