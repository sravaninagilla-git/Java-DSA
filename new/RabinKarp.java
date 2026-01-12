public class RabinKarp {
    static final int d = 256;
    static final int q = 101;
    static void search(String text, String pattern){
        int m = pattern.length();
        int n = text.length();
        int p = 0, t = 0, h = 1;
        //h= pow (d, m-1)% q
        for(int i = 0; i < m - 1;i++)
        h = (h * d) % q;
        //Calculate hash of pattern and first window
        for(int i = 0; i < m; i++){
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + text.charAt(i)) % q;
        }
        //slide the pattern
        for(int i = 0; i <= n - m; i++){
            //If hash matches, check characters

            if(p == t){
                int j;
                for(j = 0; j < m; j++){
                    if(text.charAt(i + j) != pattern.charAt(j))
                    break;
                }
                if(j == m)
                System.out.println("Pattern found at index " + i);
            }
            //Calculate hash of next window
            if(i < n - m){
                t = (d * (t - text.charAt(i)*h) + text.charAt(i + m)) % q;
                if(t < 0)
                t += q;
            }
        }
    }
    public static void main(String[] args) {
        String text = "ABCCDDAEFG";
        String pattern = "CDD";
        search(text, pattern);
        
    }
    
}
