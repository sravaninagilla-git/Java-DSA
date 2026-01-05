import java.util.*;
public class fibonacciMemoization {
    static int[] dp;
    static int fib(int n){
        if(n <= 1)
        return n;
        if(dp[n] != -1)
        return dp[n];
        return dp[n] = fib(n - 1)+ fib(n - 2);
    }
    public static void main(String[] args) {
        int n = 50;
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("Fibonacci(" + n + ") = " + fib(n));
        
    }
    
}
