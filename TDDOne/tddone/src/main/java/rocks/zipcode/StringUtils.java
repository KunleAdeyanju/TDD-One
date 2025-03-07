package rocks.zipcode;
/** 
 * EXERCISE 1: StringUtils
 * 
 * Implement the StringUtils class to make all tests pass.
 * The class should have methods to:
 * - reverse a string
 * - count occurrences of a character in a string
 * - check if a string is a palindrome (ignoring case and non-alphanumeric characters)
 */

 // Student must implement this class
public class StringUtils {
    // TODO: Implement the following methods to make the tests pass
    
    public static String reverse(String str) {
        // Your implementation here
        StringBuilder reverse = new StringBuilder(str);

        return reverse.reverse().toString();

    }
    
    public static int countOccurrences(String str, char c) {
        // Your implementation here
        char[] s = str.toCharArray();
        int w = 0;

        for(int i = 0; i < s.length; i++){
            if(s[i] == c){
                w++;
            }
        }

        return w;
    }
    
    public static boolean isPalindrome(String str) {
        // Your implementation here
        // Note: Ignoring case and non-alphanumeric characters
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";


        //ingBuilder ogString = new StringBuilder();
        StringBuilder reverseStringB = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(s.contains(String.valueOf(str.charAt(i)))){
                reverseStringB.append(String.valueOf(str.charAt(i)));
            }
        }
        String str2 = reverseStringB.toString().replaceAll(" ", "");
        String r = reverse(reverseStringB.toString());

        //System.out.println(str2 + "\n" + r);


        return (str2.equalsIgnoreCase(r));
    }
}

