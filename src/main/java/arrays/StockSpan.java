package arrays;

import java.util.Scanner;
import java.util.Stack;

// next greater element to the left
public class StockSpan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = {2,5,9,3,1,12,6,8,7};

        // pop
        // ans
        // push

        int span[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0); // we push index because we have to find stockSpan
        span[0] = 1;
        for(int i=1 ; i<arr.length ; i++)
        {
            while(!st.isEmpty() && arr[i]>arr[st.peek()])
            {
                st.pop();
            }

            if(st.isEmpty())
            {
                span[i] = i+1;
            }
            else {
                span[i] = i-st.peek();
            }
            st.push(i);
        }
      for(int x: span)
      {
          System.out.print(x+" ");
      }
    }
}
