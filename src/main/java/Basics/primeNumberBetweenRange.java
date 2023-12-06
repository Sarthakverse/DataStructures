package Basics;

import java.util.Scanner;

public class primeNumberBetweenRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int low = s.nextInt();
        int high = s.nextInt();

        for(int i = low ; i< high ; i++)
        {
          if(isPrime(i)){
              System.out.print(i+" ");
          };
        }
    }

    public static boolean isPrime(int x){
        int count =0;
        if(x==0 || x==1){
            return false;
        }
        for(int i=2 ; i*i <= x ; i++){
            if(x%i ==0)
            {
                count++;
                break;
            }
        }
        return count == 0;
    }
}
