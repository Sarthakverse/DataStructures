package arrays;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size of arr1 and arr2");
        int size1 = s.nextInt();
        int size2 = s.nextInt();
        System.out.println("enter array 1 elements ");
        int arr1[] = new int[size1];
        for(int i=0 ; i<size1 ; i++)
        {
            arr1[i] = s.nextInt();
        }
        System.out.println("enter array 2 elements");
        int arr2[] = new int[size2];
        for(int i=0 ; i<size2 ; i++)
        {
            arr2[i] = s.nextInt();
        }


        //perform the logic of sum
        int size3 = size1>size2 ? size1 : size2;
        int sum[] = new int [size3];

        int carry = 0;
        int i = size1 -1;
        int j  = size2 -1;
        int k = size3 -1;

        while(k >=0)
        {
            int d = carry;
            if(i >= 0)
            {
                d = d + arr1[i];
            }
            if(j >= 0)
            {
                d = d + arr2[j];
            }

            carry = d/10;
            d = d %10;

            sum[k] = d;

            i--;
            j--;
            k--;

        }
        if(carry !=0 )
        {
            System.out.println(carry);
        }
        for (int x : sum)
        {
            System.out.print(x+" ");
        }



    }
}
