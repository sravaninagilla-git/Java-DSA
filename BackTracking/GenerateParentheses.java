import java.util.*;

public class GenerateParentheses {

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String current,
            int open, int close, int n) {

        // If the current string is complete
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // Add '(' if possible
        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }

        // Add ')' if it remains valid
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pairs (n): ");
        int n = sc.nextInt();

        List<String> result = generateParenthesis(n);

        System.out.println("Valid Parentheses Combinations:");
        for (String s : result) {
            System.out.println(s);
        }

        sc.close();
    }
}
