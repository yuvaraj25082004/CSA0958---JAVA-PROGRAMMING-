import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second integer: ");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("Sum: " + sum);


        int difference = a - b;
        System.out.println("Difference: " + difference);

        try {

            int quotient = a / b;
            System.out.println("Quotient: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        int product = a * b;
        System.out.println("Product: " + product);
        scanner.close();
    }
}
