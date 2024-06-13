import java.util.Scanner;
public class BinaryToDecimalOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal Number: " + decimal);
        String octal = decimalToOctal(decimal);
        System.out.println("Octal: " + octal);
    }
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(binary.charAt(length - 1 - i));
            decimal += digit * Math.pow(2, i);
        }
        return decimal;
    }
    public static String decimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();
        while (decimal != 0) {
            int remainder = decimal % 8;
            octal.insert(0, remainder);
            decimal /= 8;
        }
        return octal.toString();
    }
}
