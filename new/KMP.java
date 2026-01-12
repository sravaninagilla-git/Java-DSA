public class KMP {
    public static void KMPSearch(String text, String pattern){
        int n = text.length();
        int m = pattern.length();
        int[] lps = new int[m];
        computerLPS(pattern, lps);
        int i = 0;
        int j = 0;
        while(i < n){
            if(text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }
            if(j == m){
                System.out.println("Pattern found at index " + (i - j)) ;j = lps[j - 1];
            }else if(i < n && text.charAt(i) != pattern.charAt(j)){
                if(j != 0)
                j = lps[j - 1];
                else
                i++;
            }
        }
    }

    public static void computerLPS(String pattern, int[] lps) {
        int prevLPS = 0;
        int i = 1;
        lps[0] = 0;
        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(prevLPS)) {
                lps[i] = prevLPS + 1;
                prevLPS++;
                i++;
                // System.out.println("MATCH -> lps[" + (i - 1) + "] = " + lps[i-1]);
            } else if (prevLPS == 0) {
                lps[i] = 0;
                i++;
                // System.out.println(" NO PREFIX -> lps[" + (i -1) + "]= 0);
            } else {
                prevLPS = lps[prevLPS - 1];
                // System.out.println("FALL BACK -> prevLPS = " + prevLPS);
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";
        KMPSearch(text, pattern);
    }

}
