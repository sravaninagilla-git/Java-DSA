    import java.util.Stack;

public class infixtoprefix2 {
     static int precedence(char ch){
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    static boolean isOperator(char ch){
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
    }
    static boolean isRightAssociative(char ch){
        return ch == '^';
    }
    static String infixToPostfix(String exp){
        Stack <Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(char c: exp.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if(c == '(') {
                stack.push(c);
            } else if (c == ')') {
              while(!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
    static String reverseAndSwap(String exp){
        StringBuilder reversed = new StringBuilder();
        for(int i = exp.length() -1; i >= 0; i--){
            char ch = exp.charAt(i);
            if (ch == '(') reversed.append(')');
            else if (ch == ')') reversed.append('(');
            else reversed.append(ch);
                
            }
            return reversed.toString();
        }

    
    static  String infixToPrefix(String infix){
        String reversed = reverseAndSwap(infix);
        String postfix = infixToPostfix(reversed);
        return new StringBuilder(postfix).reverse().toString();
    }
    public static void main(String[] args) {
        String exp = "(a-b/c)*(a/k-1)";
        System.out.println("Infix Expression: " + exp);
        System.out.println("Postfix Expression: " + infixToPostfix(exp));
    }
}