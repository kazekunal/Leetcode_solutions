package sorting_algo;

import java.util.HashMap;

public class hashmap_method {
    public static void main(String[] args) {
        HashMap<String, Integer> hmp = new HashMap<>(); // hashmaps are parameterized so the paramaters are Strings and integers...
        hmp.put("kunal", 123);
        hmp.put("hello", 435);
        System.out.println(hmp);   // mapping of keys to ids
    }
}
