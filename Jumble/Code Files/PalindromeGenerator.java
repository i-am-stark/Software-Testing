package jumble;

public class PalindromeGenerator {
    public int generatePalindrome(int number) {
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        return reverse;
    }
}
