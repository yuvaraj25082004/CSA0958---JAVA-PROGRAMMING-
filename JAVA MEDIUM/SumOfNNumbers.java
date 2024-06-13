import java.util.Scanner;
public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        String input = scanner.next();
        try {
            int n = Integer.parseInt(input);
            if (n <= 0) {
                System.out.println("Invalid input: The number must be greater than 0.");
            } else {
                int[] numbers = new int[n];
                System.out.println("Enter " + n + " numbers:");

                for (int i = 0; i < n; i++) {
                    try {
                        numbers[i] = scanner.nextInt();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("ArrayIndexOutOfBoundsException: Index " + i + " is out of bounds.");
                        break;
                    }
                }
                int sum = 0;
                try {
                    for (int i = 0; i <= n; i++) { 
                        sum += numbers[i];
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ArrayIndexOutOfBoundsException caught during summation.");
                }
                System.out.println("Sum: " + sum);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid integer.");
        }
        scanner.close();
    }
}
