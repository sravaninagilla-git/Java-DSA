import java.util.Stack;

public class infixtopostfix {
    static int precedence(char ch) {
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

    static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
    }

    static boolean isRightAssociative(char ch) {
        return ch == '^';
    }

    static String infixToPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isLetter(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);

            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());

                }
                stack.pop();

            } else if (isOperator(ch)) {
                while (!stack.isEmpty() && isOperator(stack.peek())) {
                    char top = stack.peek();
                    if (precedence(ch) < precedence(top)
                            || (precedence(ch) == precedence(top) && !isRightAssociative(ch))) {
                        result.append(stack.pop());

                    }
                }
            } else {
                break;
            }
            stack.push(ch);
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());

        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "(2 + 3) * 5 - 8 / 4";
        System.out.println("Infix Expression : " + s);
        System.out.println("Postfix Expression : " + infixToPostfix(s));
    }
}