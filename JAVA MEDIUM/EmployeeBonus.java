import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the grade of the employee (A/B):");
            char grade = scanner.next().charAt(0);
            System.out.println("Enter the employee salary:");
            double salary = scanner.nextDouble();
            if (salary < 0) {
                System.out.println("Invalid input. Salary cannot be negative.");
            } else if (grade != 'A' && grade != 'B') {
                System.out.println("Invalid input. Grade must be A or B.");
            } else {
                double bonus = 0;
                if (grade == 'A') {
                    bonus = salary * 0.05;
                } else if (grade == 'B') {
                    bonus = salary * 0.10;
                }
                if (salary < 10000) {
                    bonus += salary * 0.02;
                }
                double totalToBePaid = salary + bonus;
                System.out.println("Salary=" + salary);
                System.out.println("Bonus=" + bonus);
                System.out.println("Total to be paid=" + totalToBePaid);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid salary and grade.");
        }
        scanner.close();
    }
}
