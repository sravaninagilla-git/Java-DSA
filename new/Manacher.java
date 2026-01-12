public class Manacher {
    public static String longestPalindrome(String s){

        if( s == null || s.length() == 0)return "";
        //step 1: Transform string
        StringBuilder t = new StringBuilder( "#");
        for(char c : s.toCharArray()){
            t.append(c).append( "#");
        }
        int n = t.length();
        int[] p = new int[n];
        int center = 0, right = 0;
        int maxLen = 0 ,centerIndex = 0; 
        // Step 2 & 3
        for(int  i =0 ; i < n; i++){
            int mirror = 2 * center - i;
            if(i < right)
            p[i] = Math.min(right - i, p[mirror]);
            //Expand
            int a = i + (1 + p[i]);
            int b = i - (1 + p[i]);
            while(a < n && b >= 0 && t.charAt(a)== t.charAt(b)){
                p[i]++;
                a++;
                b--;
            }
            //Update center & right
            if(i + p[i] > right){
                center = i;
                right = i+p[i];
            }
            if(p[i] > maxLen){
                maxLen = p[i];
                centerIndex = i;
            }
        }
        int start = (centerIndex - maxLen)/2;
        return s.substring(start, start+maxLen);
    }
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }    
}
