import java.util.*;
public class Day2_HashMapTwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4}; 
        int target = 6; 
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int need = target - nums[i]; 
            if(map.containsKey(need)) { 
                System.out.println("map.get(need) + " + i);
                return;
            }

            map.put(nums[i], i); 
        }
    }
}