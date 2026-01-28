import java.util.Arrays;
public class LTS {
    static int lis(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for(int i = 1;i < n; i++){
            for(int j = 0;j < i;j++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                }
            }
        }
        int max = 0;
        for(int val : dp)
        max = Math.max(max, val);
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("LTS Length:"+ lis(arr) );
    }


    
}
