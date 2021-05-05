package com.example.application;

import java.util.Stack;
import java.util.Scanner;

public class Convertidor {

    static int Prec(String ch)
    {
        switch (ch)
        {
            case "+":
            case "-":
                return 1;

            case "*":
            case "/":
                return 2;

            case "^":
                return 3;
        }
        return -1;
    }


    static String infixToPostfix(String exp) {
        Scanner scan = new Scanner(exp);
        // initializing empty String for result
        String result = new String("");

        // initializing empty stack
        Stack<String> stack = new Stack<>();
        String[] operandos = exp.split(" ");

        while (scan.hasNext()) {
            String temp = scan.next();
            try {
                double operand = Double.parseDouble(temp);
                result += operand+" ";

            }catch(Exception e){
                if(temp.equals("(")){
                    stack.push(temp);
                }else if(temp.equals(")")){
                    while (!stack.isEmpty() && !stack.peek().equals("(")){
                        result += stack.pop();
                    }
                }else{
                    while(!stack.isEmpty() && Prec(temp) <= Prec(stack.peek())){
                        result += stack.pop();
                    }
                    stack.push(temp);
                }

            }
        }
        while (!stack.isEmpty()){
            if(stack.peek().equals("("))
                return "Expresion invalida";
            result += stack.pop();
        }
        return result;
    }
}
