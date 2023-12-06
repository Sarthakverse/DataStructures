package Basics;

import java.util.Scanner;

public class printDigitsOfANumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int i=0, num =0;
        while(n>0){
            int rem = n%10;
            num = (int)(num + rem*Math.pow(10,i));
            i++;
            n = n/10;
        }
        System.out.println(num);
    }
}
