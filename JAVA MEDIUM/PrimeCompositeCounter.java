import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeCompositeCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the numbers (type 'done' to finish):");

        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println(input + " is not a valid integer.");
            }
        }

        int primeCount = 0;
        int compositeCount = 0;

        for (int number : numbers) {
            if (number > 1) {
                if (isPrime(number)) {
                    primeCount++;
                } else {
                    compositeCount++;
                }
            }
        }

        System.out.println("Composite number: " + compositeCount);
        System.out.println("Prime number: " + primeCount);

        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
