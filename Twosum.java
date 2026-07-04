
      
import java.util.*;
public class Day3 {
    public static void main(String[] args) {
        
        int[] nums = {3,2,4};
        int target = 6;
        int answer1 = -1;
        int answer2 = -1;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length;j++)
             {
                
                if(nums[i] + nums[j] == target) {
                    answer1 = i; 
                    answer2 = j; 
                }
            }
        }

        
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("Answer Indexes: [" + answer1 + ", " + answer2 + "]");
    }
}