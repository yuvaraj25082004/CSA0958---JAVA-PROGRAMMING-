import java.util.Scanner;
public class ProvidentFundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the employee's basic salary:");
            double basicSalary = scanner.nextDouble();

            if (basicSalary < 0) {
                throw new IllegalArgumentException("Basic salary cannot be negative");
            }

            double interestRate = calculateInterestRate(basicSalary);
            System.out.println("Provident Fund interest rate: " + interestRate + "%");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static double calculateInterestRate(double basicSalary) {
        double interestRate;
        if (basicSalary <= 10000) {
            interestRate = 8.0;
        } else if (basicSalary <= 20000) {
            interestRate = 9.0;
        } else {
            interestRate = 10.0;
        }
        return interestRate;
    }
}
