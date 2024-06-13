import java.util.Scanner;
public class DecimalConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.println("Enter a Decimal Number:");
        String input = scanner.nextLine();        
        try {
            double decimalNumber = Double.parseDouble(input);
            if (decimalNumber % 1 != 0) {
                System.out.println("Please enter a valid integer decimal number.");
            } else {
                int intNumber = (int) decimalNumber;
                String binaryNumber = Integer.toBinaryString(intNumber);
                String octalNumber = Integer.toOctalString(intNumber);               
                System.out.println("Binary Number = " + binaryNumber);
                System.out.println("Octal Number = " + octalNumber);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid decimal number.");
        }
        scanner.close();
    }
}
