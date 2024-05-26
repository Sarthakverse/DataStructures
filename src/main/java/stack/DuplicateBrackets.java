package stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string");
        String str = s.nextLine();
        Stack<Character> st = new Stack<>();
        // (a+b)+((c+d))
        int i=0;
        while(i<str.length())
        {
            char c = str.charAt(i);
            if(c != ')')
            {
                st.push(c);
            }

            else {
               if(st.peek() == '(')
               {
                   System.out.println("duplicate is there");
                   return;
               }
               else
               {
                   while(st.peek() != '(')
                   {
                       st.pop();
                   }
                   st.pop();
               }
            }
            i++;
        }
            System.out.println("not duplicate");
    }
}
