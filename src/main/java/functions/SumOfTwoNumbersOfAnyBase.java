package functions;

import java.util.Scanner;

public class SumOfTwoNumbersOfAnyBase {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int base = s.nextInt();
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        System.out.println(sumOfTwoNos(base,n1,n2));
    }
    public static int sumOfTwoNos(int base , int n1 , int n2){
        int num = 0;
        int carry = 0;
        int p = 1;
        while(n1!=0 || n2!=0 || carry!=0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            n1 = n1/10;
            n2 = n2/10;
            int dSum = d1+d2+carry;
            carry = dSum/base;
            dSum = dSum%base;
            num = num + p*dSum;
            p = p*10;
        }
        return num;
    }
}
