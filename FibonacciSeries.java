public class Day5_Fibonacci {
    public static void main(String[] args) {
        int n = 10; 
        int n1 = 0, n2 = 1;
        
        System.out.print(n1+ " " + n2+ " "); 
        
        for(int i = 2; i < n; i++) {
            int next = n1 + n2; 
            System.out.print(next + " ");
            
            n1 = n2;    
            n2 = next;
        }
    }
}