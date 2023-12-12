package functions;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiplicationOfTwoNumbersWithDiffBases {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int base = s.nextInt();
        System.out.println(productIs(n1,n2,base));
    }
    public static int productIs(int n1 , int n2 , int base){
        int temp = n2;
        int temp2 = n1;
        int countDigitsInN2 = 0;
        while(temp>0){
            temp = temp/10;
            countDigitsInN2++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0 ; i<countDigitsInN2 ; i++)
        {
            int productWithADigit = 0;
            int multiplier = 1;
            int carry = 0;
            int digitOfN2 = n2%10;
            while(temp2>0 || carry>0){
                int digitOfN1 = temp2%10;
                int proOfDigit = digitOfN1*digitOfN2 + carry;
                carry = proOfDigit/base;
                int rem = proOfDigit % base;
                productWithADigit = productWithADigit + multiplier*rem;
                multiplier = multiplier*10;
                temp2 = temp2/10;
            }
            list.add(productWithADigit);
            n2 = n2/10;
            temp2 = n1;

        }

        int sum =0;
        for(int i=0 ;i<list.size() ;i++){
           int x = list.get(i);
           x = (int)(x *Math.pow(10,i));
           list.set(i,x);
           sum = sum+list.get(i);
        }
       return sum;

    }
}
