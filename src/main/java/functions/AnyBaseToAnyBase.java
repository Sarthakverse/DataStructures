package functions;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b1 = s.nextInt();
        int b2 = s.nextInt();

        System.out.println(anyToAny(n,b1,b2));
    }
    private static int anyToAny(int n , int b1 , int b2){
        int num = 0;
        int power = 0;
        while(n!=0){
            int rem = n%10;
            n = n/10;
            num = (int)(num +Math.pow(b1,power++)*rem);
        }
//        System.out.println(num);
        int actualNum = 0;
        power =0;
        while(num !=0){
            int rem = num %b2;
            num = num/b2;
            actualNum = (int)(actualNum+Math.pow(10,power++)*rem);
        }
        return actualNum;
    }
}
