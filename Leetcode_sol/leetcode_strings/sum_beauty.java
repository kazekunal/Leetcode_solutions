package Leetcode_sol.leetcode_strings;

public class sum_beauty {
    public static int beauty(String s){
        int total_b = 0;
        int n = s.length();
        for( int i = 0; i<n; i++){
            int[] freq = new int[26];
            for(int j = 0; j<n; j++){
                freq[s.charAt(j) - 'a']++;
                int maxfreq = 0;
                int minfreq = Integer.MAX_VALUE;
                for(int f: freq){
                    if(f>0){
                        maxfreq = Math.max(maxfreq, f);
                        minfreq = Math.min(minfreq, f);
                    }
                }
                total_b += maxfreq - minfreq;
            }
        }
        return total_b;
    }
    public static void main(String[] args) {
        String s = "aabc";
        System.out.println(beauty(s));
    }
}
