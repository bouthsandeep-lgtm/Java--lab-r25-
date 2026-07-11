


import java.util.*;

public class EasyGroup {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String w : words) {
            char[] arr = w.toCharArray();
            Arrays.sort(arr); 
            String key = String.valueOf(arr);
            
            
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(w);
        }
        
        System.out.println(map.values()); 
    }
}