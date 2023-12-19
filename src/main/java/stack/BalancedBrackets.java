package stack;

import java.util.Scanner;
import java.util.Stack;

//        [(a+b) + {(c+d) * (e+f)}]  --> balanced
//        [(a+b) + {(c+d) * (e/f)]}  --> unbalanced
public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (ch == ')' || ch == ']' || ch == '}')
            {
                if(ch == ')')
                {
                    while(st.peek() != '(')
                    {
                        st.pop();
                        if(st.peek() == '{' || st.peek() == '[')
                        {
                            System.out.println("UNBALANCED");
                            return;
                        }
                    }
                    st.pop();
                }
                else if(ch == ']')
                {
                   while(st.peek() != '[')
                   {
                       st.pop();
                       if(st.peek() == '{' || st.peek() == '(')
                       {
                           System.out.println("Unbalanced");
                           return;
                       }
                   }
                }

                else
                {
                    while(st.peek() != '{')
                    {
                        st.pop();
                        if(st.peek() == '(' || st.peek() == '[')
                        {
                            System.out.println("uNBalanced");
                            return;
                        }
                    }
                }
            }
            else
            {
               st.push(ch);
            }
        }
        System.out.println("Balanced");

    }
}
