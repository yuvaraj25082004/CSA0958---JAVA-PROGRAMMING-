import java.util.ArrayList;
import java.util.List;
public class PerfectNumbers {
    public static void main(String[] args) {
        int n = 3; // Sample input
        printFirstNPerfectNumbers(n); // Calling the method
    }
    public static void printFirstNPerfectNumbers(int n) {
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer greater than 0.");
            return;
        }
        List<Integer> perfectNumbers = new ArrayList<>();
        int num = 1; // Starting from 1
        while (perfectNumbers.size() < n) {
            if (isPerfect(num)) {
                perfectNumbers.add(num);
            }
            num++;
        }
        System.out.print("First " + n + " perfect numbers are: ");
        for (int i = 0; i < perfectNumbers.size(); i++) {
            if (i > 0) {
                System.out.print(" , ");
            }
            System.out.print(perfectNumbers.get(i));
        }
    }
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
