public class demo {
    public static void main(String[] args) {
        int[] arr = {0, 1, 6, 7, 14, 20};
        int p1 = 0, p2 = arr.length - 1;
        int t = 13, sum = 0;
        while(p1 < p2){
            sum = arr[p1] + arr[p2];
            if(sum > t)
            p2--;
            else
            p1++;
            if(sum == t)
            break;
        }
        if(sum == t)
        System.out.println("target is found");
        else
        System.out.println("Target is not found");
    }
    
}
