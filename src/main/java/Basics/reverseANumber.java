package Basics;

import java.util.Scanner;

public class reverseANumber {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = s.nextInt();

        while(n!=0){
            System.out.print(n%10);
            n=n/10;
        }
    }
}
