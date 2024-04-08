public class PalindromeGenerator {
    public static int generatePalindrome(int n) {
        if (n == 1) {
            return 9;
        }
        int palindrome = (int) Math.pow(10, n - 1) + 1;
        return palindrome;
    }
}
