package Basics;

import java.util.Scanner;

public class BetterWayToFindIfANumberIsPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a  number n: ");
        int n = s.nextInt();
        int count =0;
        for(int i =2 ; i*i <= n ;i++)
        {
            if(n%i == 0){
                count++;
                break;
            }
        }

        if(count==0)
        {
                System.out.println("prime");
        }
        else{
            System.out.println("not prime ");
        }
    }
}
