import java.util.Scanner;

public class Student {
    private String name;
    private int registerNumber;
    private int[] subjectMarks;

    public Student(String name, int registerNumber, int[] subjectMarks) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.subjectMarks = subjectMarks;
    }

    public int calculateTotalMarks() {
        int total = 0;
        for (int mark : subjectMarks) {
            total += mark;
        }
        return total;
    }

    public double calculateAverageMarks() {
        int total = calculateTotalMarks();
        return (double) total / subjectMarks.length;
    }
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Subject Marks:");
        for (int i = 0; i < subjectMarks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + subjectMarks[i]);
        }
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.println("Average Marks: " + calculateAverageMarks());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Register Number:");
        int registerNumber = scanner.nextInt();

        int[] subjectMarks = new int[5];
        System.out.println("Enter Subject Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter marks for Subject " + (i + 1) + ":");
            subjectMarks[i] = scanner.nextInt();
        }

        Student student = new Student(name, registerNumber, subjectMarks);

        student.displayStudentDetails();

        scanner.close();
    }
}
