import java.util.Arrays;

class KMP {
//other methods
//    naive/bruteforce
//    boyer-moore
//    rabin-karp
    public static void main(String[] args) {
        String text = "ABDABCABDABCABCABDC";
        String pat = "ABCABD";

        KMPSearch(pat, text);
    }

    static void KMPSearch(String pat, String txt) {

        int[] lps = new int[pat.length()];
        computeLPSArray(pat, lps);
        System.out.println(Arrays.toString(lps));

        int i = 0, j = 0;
        while ((txt.length() - i) >= (pat.length() - j)) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }
            if (j == pat.length()) {
                System.out.println("Pattern found at index " + (i - j));
                j = lps[j - 1];
            } else if (i < txt.length() && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
    }

    static void computeLPSArray(String pat, int[] lps) {
        int j = 0, i = 1;
        lps[0] = 0;
        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(j)) {
                j++;
                lps[i] = j;
                i++;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    lps[i] = j;
                    i++;
                }
            }
        }
    }

}