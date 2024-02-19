package jumble;

public class Factorial {
    public long calculateFactorial(long n) {
    	if (n <= 0) return 1; 
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
