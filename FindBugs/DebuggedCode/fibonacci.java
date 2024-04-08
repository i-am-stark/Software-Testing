public class fibonacci {
	public static int fibonacci_R(int n) {
        if (n <= 1)
            return n;
        return fibonacci_R(n - 1) + fibonacci_R(n - 2);
    }
}