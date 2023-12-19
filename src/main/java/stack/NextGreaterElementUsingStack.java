package stack;

import java.util.Stack;

public class NextGreaterElementUsingStack {
    public static void main(String[] args) {
        int [] arr = {2,5,9,3,1,12,6,8,7};
        Stack<Integer> st = new Stack<>();
        int [] temp = new int[arr.length];
        st.push(arr[arr.length-1]);
        temp[arr.length-1] = -1;
        for(int i = arr.length-2 ; i>=0 ; i--)
        {
           while(st.size()>0 && arr[i] >= st.peek())
           {
               st.pop();
           }

           if(st.size() == 0)
           {
               temp[i] = -1;
           }
           else
           {
               temp[i] = st.peek();
           }
           st.push(arr[i]);
        }
        for(int x:temp)
        {
            System.out.print(x+" ");
        }
    }
}
