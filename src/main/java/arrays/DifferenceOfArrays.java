package arrays;

import java.util.Scanner;

public class DifferenceOfArrays {
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

        int diff[] = new int[Math.max(size1, size2)];
        // perform the diff logic now
        int carry = 0;
        int i = size1-1;
        int j = size2-1;
        int k = diff.length-1;
        while(k>=0)
        {
            int d = 0;
            int a1v = i >=0 ? arr1[i] : 0;

            if(arr2[j] + carry >= a1v)
            {
                d = arr2[j]+carry -a1v;
                carry =0;
            }
            else
            {
               d = arr2[j]+carry + 10 -a1v;
               carry = -1;
            }

            diff[k] = d;
            i--;
            j--;
            k--;
        }

        int idx =0 ;
        while(idx < diff.length)
        {
                if(diff[idx] == 0)
                {
                    idx++;
                }
                else
                {
                    break;
                }
        }

        while(idx < diff.length)
        {
            System.out.print(diff[idx]+ " ");
            idx++;
        }
    }
}
