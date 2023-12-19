package stack;
//        ((a+b) + (c+d)) --> no brackets unnecessary so (FALSE)
//        (a+b)+((c+d)) --> unnecessary bracket is there so (TRUE)

import java.util.Scanner;
import java.util.Stack;

public class UnnecessaryBrackets{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch == ')')
            {
                  if(st.peek() == '(')
                  {
                      System.out.println("True");
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
            else
            {
               st.push(ch);
            }
        }
        System.out.println("False");
    }
}
