package Basics;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //when you are taking integer and String both as input in the same programme then
        //you must use parseInt
       int n = Integer.parseInt(s.nextLine());
//      int n = s.nextInt(); --> this is wrong
        String str = s.nextLine();

        System.out.println("hi, "+str+" your counting is below ");
        for(int i= 0 ; i<n ; i++)
        {
            System.out.print(i+" ");
        }
    }
}
