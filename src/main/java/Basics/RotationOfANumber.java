package Basics;

import java.util.Scanner;

public class RotationOfANumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        for(int i=0 ;i<k ;i++){
            n =rotateByOne(n);
        }
        System.out.println(n);

    }
    public static int rotateByOne(int n){
        if(n<10){
            System.out.println("rotation is not possible, because single digit number");
            return 0;
        }
        int tempStoredValue = n%10;
        int temp = n;
        int size = 0;

        while(temp!=0){
            temp= temp/10;
            size++;
        }
        temp = n;
        temp = temp/10;
        return (int)(temp + tempStoredValue*Math.pow(10,size-1));
    }
}
