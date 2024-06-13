import java.util.Scanner;
public class MissingNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of 'n':");
        int n = scanner.nextInt();

        int[] a = new int[n - 1];
        System.out.println("Enter the elements of array 'a' (in the range 1 to " + n + "):");
        for (int i = 0; i < n - 1; i++) {
            a[i] = scanner.nextInt();
        }

        int sum = (n * (n + 1)) / 2;
        int arraySum = 0;
        for (int num : a) {
            arraySum += num;
        }

        int missingNumber = sum - arraySum;
        System.out.println("The missing number is: " + missingNumber);

        scanner.close();
    }
}
