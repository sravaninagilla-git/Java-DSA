import java.util.Stack;

public class precedenceproblem {
    static int precedence(char c){
        if(c == '^')
        return 3;
        else if (c == '/' || c == '*')
        return 2;
        else if(c == '+' || c == '-')
        return 1;
    }
    static String changeToPostfix(String s ){
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(int i =0;i< s.length;i++){
            char c = s.charAt(i);
            if(c>= 'a' && c <= 'z')|| (c >= 'A' && c <= 'Z')|| (c>= '0' && c <= '9'){
            res.append(c);
            }else if (c == ')' ){
                while(!st.isEmpty() && st.peek() != '('){
                    res.append(t.pop());
                }
            }else{
                while(!isEmpty()&& st.peek()!= '('&& (precedence(c)))
            }
        } 
    }
        public static void main(String[] args) {
        
    }
    
}
