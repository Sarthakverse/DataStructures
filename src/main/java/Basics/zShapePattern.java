package Basics;

import java.util.Scanner;

public class zShapePattern {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("enter n: ");
        n = s.nextInt();
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==0 || i==n-1)
                {
                    System.out.print("*");
                }
                else{
                    if(j == n-i-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
