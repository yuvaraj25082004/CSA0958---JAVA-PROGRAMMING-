import java.util.Scanner;
public class AverageNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int positiveSum = 0;
        int negativeSum = 0;
        System.out.println("Enter -1 to exit...");
        int num;
        do {
            System.out.print("Enter the number: ");
            num = scanner.nextInt();
            if (num != -1) {
                if (num >= 0) {
                    positiveCount++;
                    positiveSum += num;
                } else {
                    negativeCount++;
                    negativeSum += num;
                }
            }
        } while (num != -1);
        if (positiveCount > 0) {
            double positiveAverage = (double) positiveSum / positiveCount;
            System.out.println("The average of positive numbers is: " + positiveAverage);
        } else {
            System.out.println("No positive numbers entered.");
        }
        if (negativeCount > 0) {
            double negativeAverage = (double) negativeSum / negativeCount;
            System.out.println("The average of negative numbers is: " + negativeAverage);
        } else {
            System.out.println("No negative numbers entered.");
        }
        scanner.close();
    }
}
