package stack;

import java.util.Scanner;
import java.util.Stack;

// -+2/*6483
public class PrefixEvaluationAndConversion {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         String expression = s.nextLine();

         Stack<Integer> valueStack = new Stack<>();
         Stack<String> postfixStack = new Stack<>();
         Stack<String> infixStack = new Stack<>();

         for(int i = expression.length()-1 ; i>=0 ; i--)
         {
            char ch = expression.charAt(i);

             if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
             {
                 int val1 = valueStack.pop();
                 int val2 = valueStack.pop();
                 int val = Operan(val1,val2,ch);
                 valueStack.push(val);

                 String post1 = postfixStack.pop();
                 String post2 = postfixStack.pop();
                 String postVal = post1 + post2 + ch;
                 postfixStack.push(postVal);

                 String inf1 = infixStack.pop();
                 String inf2 = infixStack.pop();
                 String infVal  = "(" + inf1 + ch + inf2 + ")";
                 infixStack.push(infVal);
             }

             else
             {
                 valueStack.push(ch-'0');
                 postfixStack.push(ch+"");
                 infixStack.push(ch+"");
             }

         }
        System.out.println(valueStack.pop());
        System.out.println("infix : "+infixStack.pop());
        System.out.println("postfix :"+postfixStack.pop());
    }

    private static int Operan(int val1, int val2, char ch) {
        if(ch == '+') return val1+val2;
        else if(ch == '-') return val1-val2;
        else if(ch == '*') return val1*val2;
        else if(ch == '/') return val1/val2;
        else return 0;
    }
}
