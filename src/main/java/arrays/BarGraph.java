package arrays;

import java.util.Scanner;

public class BarGraph {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of bar graph array ");
        int size = s.nextInt();
        int arr [] = new int [size];
        System.out.println("enter the "+size+"  elements of bar graph ");
        for(int i=0 ; i<size ; i++)
        {
            arr[i] = s.nextInt();
        }

        // rows to iterate ?
        int max = arr[0];
        for(int i=1; i<size ; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }

        int rows = max;
        int coll = size;

        //print the bar graph

        for(int i = rows ; i>=1 ; i--)
        {
            for(int j=0 ; j<coll ; j++)
            {
                if(arr[j] >= i)
                {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
