package stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String exp = s.nextLine();

       Stack<Integer> operands = new Stack<>();
       Stack<Character> operators = new Stack<>();

       for(int i=0 ; i<exp.length() ; i++)
       {
           char ch = exp.charAt(i);
           if(ch == '('){
              operators.push(ch);
           }else if(Character.isDigit(ch)){
              operands.push(ch - '0');
           }
           else if(ch == ')'){
              while(operators.peek() != '('){
                   char operator = operators.pop();
                   int v2 = operands.pop();
                   int v1 = operands.pop();
                   int opn = operation(v1,v2,operator);
                   operands.push(opn);
              }
              operators.pop();
           }else if(ch == '+' || ch =='-' || ch == '*' || ch == '/' ){
                   while(!operators.isEmpty() && operators.peek() !='(' &&
                          precedence(ch) <= precedence(operators.peek()))
                   {
                       char operator = operators.pop();
                       int v2 = operands.pop();
                       int v1 = operands.pop();
                       int opn = operation(v1,v2,operator);
                       operands.push(opn);
                   }
                  operators.push(ch);
           }
       }
        while(!operators.isEmpty()){
            char operator = operators.pop();
            int v2 = operands.pop();
            int v1 = operands.pop();
            int opn = operation(v1,v2,operator);
            operands.push(opn);
        }
        System.out.println(operands.peek());

    }

    public static int precedence(char operator)
    {
        if(operator == '+') return 1;
        else if(operator == '-') return 1;
        else if(operator == '*') return 2;
        else return 2;
    }

    public static int operation(int v1,int v2,char operator)
    {
        if(operator == '+') return v1+v2;
        else if(operator == '-') return v1-v2;
        else if(operator == '*') return v1*v2;
        else return v1/v2;
    }
}
