package tests;

import cute.Cute;

public class NumberChecker {
    private int number;

    public NumberChecker(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        NumberChecker checker = new NumberChecker(Cute.input.Integer());
        for (int i = 0; i < 3; i++) {
            switch (Cute.input.Integer()) {
                case 0:
                    System.out.println("Is Prime: " + checker.isPrime());
                    break;
                case 1:
                    System.out.println("Is Odd: " + checker.isOdd());
                    break;
                case 2:
                    System.out.println("Is Even: " + checker.isEven());
                    break;
            }
        }
    }
}
