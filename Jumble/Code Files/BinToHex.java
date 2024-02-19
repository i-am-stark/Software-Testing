package jumble;

public class BinToHex {
    public String convertBinaryToHexadecimal(String binary) {
        // Convert binary string to integer
        int decimal = Integer.parseInt(binary, 2);
        // Convert integer to hexadecimal string
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();
        return hexadecimal;
    }
}
