import java.util.Scanner;

public class BinaryToHexadecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        String hexadecimal = convertBinaryToHexadecimal(binary);
        System.out.println("Hexadecimal equivalent: " + hexadecimal);

        scanner.close();
    }

    public static String convertBinaryToHexadecimal(String binary) {
        // Convert binary to decimal first
        int decimal = Integer.parseInt(binary, 2);

        // Convert decimal to hexadecimal
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();

        return hexadecimal;
    }
}