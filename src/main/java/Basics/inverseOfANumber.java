package Basics;

import java.util.Scanner;
// GOOD QUESTION
public class inverseOfANumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = 0;
        int counter=0;
        while(n>0){
            int rem = n%10;
            counter++;
            num = (int)(num + counter*Math.pow(10,rem-1));
            n=n/10;
        }
        System.out.println(num);

    }
}
