package Leetcode_sol.leetcode_strings;

import java.util.HashMap;
import java.util.PriorityQueue;

public class sort_freq {
    public static String frequency(String s){
        HashMap<Character, Integer> hmp = new HashMap<>();
        for(char ch : s.toCharArray()){
            hmp.put(ch , hmp.getOrDefault(ch, 0) + 1);
        }
        
        // very interesting concept - by default java has priority queues in min-heap
        // which means that by def, the priority will be lowest to highest
        // we use comparator to change this 
        PriorityQueue<Character> maxheap = new PriorityQueue<>(
            (a,b) -> hmp.get(b) - hmp.get(a)
        );
        maxheap.addAll(hmp.keySet());

        StringBuilder result = new StringBuilder();
        while(!maxheap.isEmpty()){
            char c = maxheap.poll(); //returns the topmost element and remove it
            int count = hmp.get(c);
            for( int i = 0; i<count; i++){
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "kunall";
        System.out.println(frequency(s));

    }
}