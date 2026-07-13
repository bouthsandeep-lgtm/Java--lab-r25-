public class StringDemo {
    public static void main(String[] args) {
        String str = "madam";
        
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        
        
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed: " + rev);
        
       
        if(str.equals(rev))
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is Not a Palindrome");
    }
}