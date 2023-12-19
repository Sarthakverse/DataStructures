package stack;

import java.util.Stack;

public class LargestAreaHistogramUsingStack {
    public static void main(String[] args) {
        int [] arr = {6,9,5,4,5,10,6};
        Stack<Integer> st = new Stack<>();
//      right boundary logic --> NEXT GREATER ELEMENT TO THE RIGHT LOGIC
        int [] rightBoundary = new int[arr.length];
        st.push(arr.length-1);
        rightBoundary[arr.length-1] = arr.length;

        for(int i = arr.length-2 ; i>=0 ; i--)
        {
            while(!st.isEmpty() && arr[i] < arr[st.peek()])
            {
                st.pop();
            }

            if(st.isEmpty()){
                rightBoundary[i] = arr.length;
            }
            else
            {
                rightBoundary[i] = st.peek();
            }
            st.push(i);
        }

//       left boundary Logic --> NEXT GREATER ELEMENT TO THE LEFT
        int [] leftBoundary = new int[arr.length];
        st.push(0);
        leftBoundary[0] = -1;

        for(int i =1 ; i<arr.length ; i++)
        {
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty())
            {
                leftBoundary[i] = -1;
            }
            else
            {
                leftBoundary[i] = st.peek();
            }
            st.push(i);
        }

        int maxAreaOfHistogram = 0;
        for(int i=0 ; i<arr.length ; i++)
        {
            int width = rightBoundary[i]-leftBoundary[i]-1;
            int area = arr[i]*width;
            if(area > maxAreaOfHistogram){
                maxAreaOfHistogram = area;
            }
        }

        System.out.println(maxAreaOfHistogram);
    }
}
