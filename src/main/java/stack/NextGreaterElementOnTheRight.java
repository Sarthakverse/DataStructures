package stack;

import java.util.Scanner;

public class NextGreaterElementOnTheRight {
    public static void main(String [] arg)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        int max = arr[0];
        for(int  i=0 ; i<n ; i++)
        {
            int j;
            if(i==n-1)
            {
                System.out.println("next greater element to the right of "+arr[i]+" is -1");
                return;
            }
            for( j = i+1; j<n ; j++)
            {
              if(max < arr[j])
              {
                  max = arr[j];
                  System.out.println("next greater element to the right of "+arr[i]+" is "+max);
                  break;
              }
            }
            if(max == arr[i])
            {
                System.out.println("next greater element to the right of "+arr[i]+" is -1");
            }
            max = arr[i+1];
        }
    }
}
