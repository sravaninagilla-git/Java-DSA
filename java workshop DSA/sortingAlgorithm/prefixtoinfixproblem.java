import java.util.Stack;

public class prefixtoinfixproblem {
    static String preToInf(String prefix) {
        Stack<String> st = new Stack<>();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                st.push(String.valueOf(c));
            } else {
                String op1 = st.pop();
                String op2 = st.pop();
                String newExp = "(" + op1 + c + op2 + ")";
                st.push(newExp);
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String prefix = "*+abc";
        System.out.println("Prefix expression: " + prefix);
        System.out.println("Infix expression: " + preToInf(prefix));
    }
}