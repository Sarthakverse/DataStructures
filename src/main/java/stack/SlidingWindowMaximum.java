package stack;

import java.util.Stack;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr = {2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 19, 8, 12};
        int windowSize=4;
        int nge[] = new int [arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);
        nge[arr.length-1] = arr.length;

        for(int i = arr.length-2 ; i>=0 ; i--)
        {
            while(!st.isEmpty() && arr[i]>=st.peek())
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                nge[i] = arr.length;
            }
            else
            {
                nge[i] = st.peek();
            }
            st.push(i);
        }
    // sliding window logic
        int j=0;
        for(int i=0 ; i< arr.length-windowSize ; i++)
        {
            if(j<i)
            {
                j=i;
            }

            while(nge[j] < i+windowSize)
            {
                j = nge[j];
            }
            System.out.print(arr[j]+" ");
        }


    }
}
