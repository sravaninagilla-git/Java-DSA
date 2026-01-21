public class sw {
  
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sw = 3;
        int cur = 0;
        for(int i = 0; i < sw; i++)
        cur += arr[i];
        //System.out.print(cur);
        for(int i =1; i <= (arr.length - sw);i++){
            System.out.println(cur);
            cur = cur + arr[i + sw - 1]- arr[i - 1];
            
        }
        System.out.println(cur);
    }
}
    

