public class maxsumsw {
    public static void main(String[] args) {
        int[] arr = {13, 12, 7, 4, 19, 6};
        int sw = 3;

        
        int cur = 0;

        // First window sum
        for (int i = 0; i < sw; i++) {
            cur += arr[i];
        }

        int maxSum = cur;

        // Sliding the window
        for (int i = 1; i < (arr.length - sw); i++) {
            cur = cur + arr[i + sw - 1] - arr[i - 1];
            
            if(cur > maxSum)
            maxSum = cur;
        }

        System.out.println("Maximum sum = " + maxSum);
    }
}

    

