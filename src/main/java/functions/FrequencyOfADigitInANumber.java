package functions;

import java.util.Scanner;

public class FrequencyOfADigitInANumber {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("enter a number n :");
        int n = s.nextInt();
        System.out.print("enter a digit whose frequency you want to find : ");
        int key = s.nextInt();
        System.out.println(countFreq(n,key));
    }

    private static int countFreq(int n, int key) {
        int count =0;
        while(n!=0){
            int rem = n%10;
            if(rem == key) count++;
            n=n/10;
        }
        return count;
    }
}
