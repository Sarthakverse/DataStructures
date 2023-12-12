package functions;

import java.util.Scanner;

public class DifferenceOfTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        System.out.println(diff(b,n1,n2));
    }
    public static int diff(int b , int n1 , int n2){
        int number = 0;
        int multiplier = 1;
        int carry = 0;
        while(n1>0){
            int d1 = n1%10;
            int d2 = n2%10;
            int d =0;
            d1 = d1 + carry;
            if(d1>=d2){
                carry = 0;
                d = d1-d2;
            }else{
                carry = -1;
                d= d1 + b - d2;
            }
            number = number + d*multiplier;
            multiplier=multiplier*10;
            n1 = n1/10;
            n2 = n2/10;
        }
        return number;
    }
}
