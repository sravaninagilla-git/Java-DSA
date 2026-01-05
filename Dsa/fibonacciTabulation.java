public class fibonacciTabulation {
    static int fib(int n){
        if(n == 0)
        return 0;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2;i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

        
    } 
    public static void main(String[] args) {
        int n =50;
        dp = new int[n + 1];
        Arrays.fill(dp,-1);
        System.out.println("Fibonacci(" + n + ") = " + fib(n));
    }

    
}
