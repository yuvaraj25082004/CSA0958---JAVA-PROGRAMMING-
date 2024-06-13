import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks in Python:");
        double pythonMarks = scanner.nextDouble();
        System.out.println("Enter the marks in C Programming:");
        double cMarks = scanner.nextDouble();
        System.out.println("Enter the marks in Mathematics:");
        double mathMarks = scanner.nextDouble();
        System.out.println("Enter the marks in Physics:");
        double physicsMarks = scanner.nextDouble();
        double total = pythonMarks + cMarks + mathMarks + physicsMarks;
        double aggregate = total / 4.0;
        System.out.println("Total= " + total);
        System.out.println("Aggregate = " + aggregate);
        if (aggregate > 75) {
            System.out.println("DISTINCTION");
        } else if (aggregate >= 60 && aggregate < 75) {
            System.out.println("FIRST DIVISION");
        } else if (aggregate >= 50 && aggregate < 60) {
            System.out.println("SECOND DIVISION");
        } else if (aggregate >= 40 && aggregate < 50) {
            System.out.println("THIRD DIVISION");
        } else {
            System.out.println("FAIL");
        }
        scanner.close();
    }
}
