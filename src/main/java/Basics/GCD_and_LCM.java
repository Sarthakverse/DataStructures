package Basics;
import java.util.Scanner;
public class GCD_and_LCM {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println("gcd id "+GCD(a,b));
        System.out.println("lcm is "+LCM(a,b));
    }

    public static int GCD(int a,int b)
    {
        while(a%b != 0)
        {
            int rem = a%b;
            a = b;
            b = rem;
        }
        return b;
    }
    public static int LCM(int a,int b)
    {
         return (a*b)/GCD(a,b);
    }
}
