package stack;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String expression = s.nextLine();

        Stack<Integer> valueStack = new Stack<>();
        Stack<String> infixStack = new Stack<>();
        Stack<String> prefixStack = new Stack<>();

        for(int i=0 ; i<expression.length() ; i++)
        {
            char ch = expression.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                 int v2 = valueStack.pop();
                 int v1 = valueStack.pop();
                 int val = OperatioN(v1,v2,ch);
                 valueStack.push(val);

                 String infv2 = infixStack.pop();
                 String infv1 = infixStack.pop();
                 String ival = "("+infv1+ch+infv2+")";
                 infixStack.push(ival);

                 String prefv2 = prefixStack.pop();
                 String prefV1 = prefixStack.pop();
                 String pval = ch + infv1 + infv2;
                 prefixStack.push(pval);
            }
            else{
                valueStack.push(ch-'0'); //to convert char into integer
                infixStack.push(ch+"");
                prefixStack.push(ch+"");

            }
        }
        System.out.println(valueStack.pop());
        System.out.println("infix : "+infixStack.pop());
        System.out.println("prefix :"+prefixStack.pop());
    }

    private static int OperatioN(int v1, int v2, char op) {
        if(op == '+'){
           return v1+v2;
        }
        else if(op == '-'){
            return v1-v2;
        } else if (op == '*') {
            return v1*v2;
        } else if (op == '/') {
            return v1/v2;
        }else{
            return 0;
        }
    }
}
