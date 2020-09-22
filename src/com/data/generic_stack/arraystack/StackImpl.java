package com.data.generic_stack.arraystack;

/*
* @AUTHOR BY RAHMAT ADITYA QUDAEDAH
* CONVERTING PREFIX AND POSTFIX TO INFIX EXPRESSION
* USING GENERIC STACK
*/

public class StackImpl {


    //apply operator method
    public static int applyOperator(char operator,int op1,int op2){
        int result = 0;
        switch (operator) {
            case '+':
                result = op1 + op2;
                break;
            case '-':
                result = op1 - op2;
                break;
            case '*':
                result = op1 * op2;
                break;
            case '/':
                result = op1 / op2;
                break;
        }
        return result;
    }
    //postfix to infix numeric only
    public void evaluatePostfix(String expr) {

        ArrayStack<Integer> stack = new ArrayStack<>();

        int x; //become a second operand
        int y; //become a first operand

        char[] ch = expr.toCharArray();
        for (char c : ch) {

            if (c >= '0' && c <= '9') {
                stack.push(Character.getNumericValue(c));
            } else {
                y = stack.pop();
                x = stack.pop();

                switch (c) {
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                        stack.push(StackImpl.applyOperator(c,x,y));
                        break;
                }
            }
        }
        System.out.println(stack.pop());
    }

    //prefix to postfix
    public void evaluatePrefix(String expr){
        ArrayStack <String> stack = new ArrayStack<>();
        String result;
        char[]chars = expr.toCharArray();
        for(int i = expr.length()-1;i>=0;--i){
            if (Character.isLetter(chars[i])){
                stack.push(Character.toString(chars[i]));
            }
            else{
                String x = stack.pop();
                String y = stack.pop();
                result = x.concat(y).concat(Character.toString(chars[i]));

                switch (chars[i]){
                    case '*':
                    case '/':
                    case '+':
                    case '-':
                        stack.push(result);
                        break;
                }
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
    //rank method
    public int rank(String token){
        if (token.equals("^")) return 3;
        if (token.equals("*")|| token.equals("/")) return 2;
        if (token.equals("+")|| token.equals("-")) return 1;
        return -1;
    }

    //infix to postfix method
    public void toPostfix(String expr){

        ArrayStack <String> stack = new ArrayStack<>();
        StringBuilder output = new StringBuilder();
        char[] chars = expr.toCharArray();
        for (char c : chars) {
            if (Character.isAlphabetic(c)) {
                output.append(c);
            }
            else if (rank(Character.toString(c)) > 0 && !stack.isEmpty()) {
                while (!stack.isEmpty() && rank(Character.toString(c)) <= rank(stack.peek())) {
                    output.append(stack.pop());
                }
                stack.push(Character.toString(c));
            }
            else if (c == '(') {
                stack.push(Character.toString(c));
            }
            else if (c == ')') {
                while (!stack.isEmpty() && !stack.peek().equals("(") && !stack.peek().equals(")")) {
                    output.append(stack.pop());
                }

                //if expression have unbalanced parentheses
                if (stack.isEmpty()){
                    stack.push(Character.toString(c));
                    break;
                }

                stack.pop();
            }
            else{
                stack.push(Character.toString(c));
            }
        }
        while(!stack.isEmpty()){
            if (stack.peek().equals(")")){
                System.out.println("your expression unbalanced");
                System.out.println("popping : "+stack.pop());
            }
            else {
                output.append(stack.pop());
            }
        }
        System.out.println("result : "+output);
    }
    //Main method
    public static void main(String[] args) {
        StackImpl s = new StackImpl();

        //define your expression above...
        s.evaluatePrefix("+ab");
        System.out.println(" ");
        s.evaluatePostfix("351-+");
        s.toPostfix("(x+y*(z-w)))");
    }
}
