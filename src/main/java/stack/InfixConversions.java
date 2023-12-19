package stack;

import java.util.Scanner;
import java.util.Stack;

// this is infix form, a + b
// prefix --> operators first and then operands, +ab
// postfix --> operands first and then operators, ab+
public class InfixConversions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String expression = s.nextLine();
        Stack<String> prefixStack = new Stack<>();
        Stack<String> postfixStack = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for(int i=0 ;i<expression.length() ; i++)
        {
            char ch = expression.charAt(i);
            if(ch == '('){
                operators.push(ch);
            }
            else if ((ch >= '0' && ch <='9')||(ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')){
                postfixStack.push(ch+""); // adding double quotes to character makes it a string
                prefixStack.push(ch+"");
            }
            else if(ch == ')'){
               while(operators.peek() != '('){
                   char op = operators.pop();
                   String postfixV2 = postfixStack.pop();
                   String postfixV1 = postfixStack.pop();
                   String postfixV = postfixV1 + postfixV2 + op;
                   postfixStack.push(postfixV);

                   String prefixV2 = prefixStack.pop();
                   String prefixV1 = prefixStack.pop();
                   String prefixV = op + prefixV1 + prefixV2;
                   prefixStack.push(prefixV);
               }
               operators.pop();
            }else if(ch == '+' || ch =='-' || ch =='*' || ch == '/'){
                while(!operators.isEmpty() && operators.peek()!= '(' && precedence(ch) <= precedence(operators.peek())){
                   char op = operators.pop();
                    String postfixV2 = postfixStack.pop();
                    String postfixV1 = postfixStack.pop();
                    String postfixV = postfixV1 + postfixV2 + op;
                    postfixStack.push(postfixV);

                    String prefixV2 = prefixStack.pop();
                    String prefixV1 = prefixStack.pop();
                    String prefixV = op + prefixV1 + prefixV2;
                    prefixStack.push(prefixV);
                }
                operators.push(ch);
            }
        }

        while(!operators.isEmpty()){
            char op = operators.pop();
            String postfixV2 = postfixStack.pop();
            String postfixV1 = postfixStack.pop();
            String postfixV = postfixV1 + postfixV2 + op;
            postfixStack.push(postfixV);

            String prefixV2 = prefixStack.pop();
            String prefixV1 = prefixStack.pop();
            String prefixV = op + prefixV1 + prefixV2;
            prefixStack.push(prefixV);
        }
        System.out.println(postfixStack.pop());
        System.out.println(prefixStack.pop());
    }

    public static int precedence(char op){
        if (op == '+' || op == '-') return 1;
        else if(op == '*' || op == '/') return 2;
        else return 0;
    }
}
