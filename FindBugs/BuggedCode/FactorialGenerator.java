public class FactorialGenerator {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 15};

        System.out.println("Factorials:");
        for (int num : numbers) {
            long factorial = generateFactorial(num);
            System.out.println(num + "! = " + factorial);
        }
    }

    public static long generateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
