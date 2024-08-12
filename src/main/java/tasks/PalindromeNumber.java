package tasks;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        //Since the conditions of the problem
        // Input: x = 121 => Output: true  |  Input: x = -121 => Output: false
        String s = String.valueOf(x);
        String sflip = new StringBuilder(s).reverse().toString();
        return s.equals(sflip);
    }
}
