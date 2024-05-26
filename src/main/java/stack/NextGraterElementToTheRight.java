package stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGraterElementToTheRight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arr[] = {2,5,9,3,1,12,6,8,7};

        Stack<Integer> st = new Stack<>();
        int nextGreatElem[] = new int[arr.length];
       st.push(arr[arr.length-1]);
       nextGreatElem[arr.length-1] = -1;

       for(int i = arr.length-2 ; i>=0 ; i--)
       {
           while(!st.isEmpty() && arr[i] >= st.peek()) {
               st.pop();
           }

           if(st.isEmpty()) {
               nextGreatElem[i] = -1;
           }

           else {
               nextGreatElem[i] = st.peek();
           }

           st.push(arr[i]);
       }
       for(int x: nextGreatElem)
       {
           System.out.print(x+" " );
       }
    }
}
