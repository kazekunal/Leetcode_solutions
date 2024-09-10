package sorting_algo;

//kpm algorithm - string matching algorithm used to find the first occurrence of a pattern (needle) in a text (haystack)

//The LPS array helps in skipping unnecessary character comparisons when a mismatch occurs.

public class kmp {
    public static int searching_kmp(String needle, String haystack) {

        int haystack_len = haystack.length();
        int needle_len = needle.length();
    
        if (needle_len == 0) {
            return 0; 
        }
    
        int[] lps = buildLPS(needle);
    
        int i = 0; 
        int j = 0; 
    
        //runs for the entire len of the haystack
        while (i < haystack_len) {
            if (haystack.charAt(i) == needle.charAt(j)) { 
                i++; 
                j++;
                
                //it means that the entire needle has been found in the haystack.
                if (j == needle_len) {
                    return i - j;
                }
                //most imp part of the algo 
            } else {
                if (j > 0) //This prevents the need to restart matching from j = 0 and instead jumps to the longest prefix that is also a suffix.
                {
                    j = lps[j - 1]; //basically goes one back in the array and checks the same again
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
}
