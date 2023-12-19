package stack;

import java.util.Stack;

public class NextGreaterElementOnTheLeft {
    public static void main(String[] args) {
        int [] arr = {2,5,9,3,1,12,6,8,7};
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int [] temp = new int[arr.length];
        temp[0] = 1;
        for(int i = 1; i<arr.length ; i++)
        {
            while(!st.isEmpty() && arr[i] > arr[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty()){
                temp[i] = i+1;
            }else{
                temp[i] = i -st.peek();
            }

            st.push(i);

        }

        for(int x :temp){
            System.out.print(x+" ");
        }
    }
}
