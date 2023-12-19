package stack;

import java.util.Stack;

public class SlidingWindowMaximumUsingStack {
    public static void main(String[] args) {
        int[] arr = {2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 19, 8, 12};
        int [] nge = new int [arr.length];

        Stack<Integer> st = new Stack<Integer>();
        st.push(arr.length-1);
        arr[arr.length-1] = arr.length;

        //next greater element logic
        for(int i= arr.length-2 ; i>=0 ; i--)
        {
//           rule is ==> pop, ans ,push
            while(!st.isEmpty() && arr[i] >= arr[st.peek()])
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

        //logic for sliding window
        int j=0;
        for(int i=0 ; i<arr.length-4 ;i++)
        {
            if(j<i)
            {
                j=i;
            }
            while(nge[j] < i+4){
                j = nge[j];
            }
            System.out.print(arr[j]+" ");
        }
    }
}
