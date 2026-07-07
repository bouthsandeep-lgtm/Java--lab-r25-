public class Day5_ReverseInteger {
    public static void main(String[] args) {
        int x = 123; 
        int reverse = 0;

        while(x != 0) {          

            int digit = x % 10;  

            reverse = reverse * 10 + digit;

            x = x / 10;          
        }
        
        System.out.println(reverse); 
    }
}