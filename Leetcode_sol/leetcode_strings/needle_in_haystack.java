package Leetcode_sol.leetcode_strings;

//sliding window approach -->

public class needle_in_haystack {
    public static int index(String needle, String haystack) {
        if(needle.isEmpty()) return 0;

        int haystack_len = haystack.length();
        int needle_len = needle.length();

        for(int i = 0; i<haystack_len - needle_len; i++){
            if(haystack.substring(i, i+needle_len).equals(needle)){
                return i;
            }
        }
        return -1;
    }

// KMP knuth morris pratt algo --> very popular in microsoft questions
// pattern searching algo 
public static int kmp(String needle, String haystack) {

    int haystack_len = haystack.length();
    int needle_len = needle.length();

    if (needle_len == 0) {
        return 0; 
    }

    int[] lps = buildLPS(needle);

    int i = 0; 
    int j = 0; 


    while (i < haystack_len) {
        if (haystack.charAt(i) == needle.charAt(j)) {
            i++;
            j++;

            if (j == needle_len) {
                return i - j;
            }
        } else {
            if (j > 0) {
                j = lps[j - 1]; 
            } else {
                i++;
            }
        }
    }

    return -1;
}


    public static int[] buildLPS(String pattern) {
        int nlen = pattern.length();
        int[] lps = new int[nlen];

        int len = 0;
        int i = 1;

        while(i<nlen){
            if(pattern.charAt(i) == pattern.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len>0){
                    len = lps[len - 1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    

    public static void main(String[] args) {
        System.out.println(index("wor", "helloworld"));
        System.out.println(kmp("sad", "butsad"));
    }
}
