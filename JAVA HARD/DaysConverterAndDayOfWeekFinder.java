import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DaysConverterAndDayOfWeekFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Days converter
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        if (totalDays < 0) {
            System.out.println("Invalid input. Number of days cannot be negative.");
            return;
        }

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        System.out.println("No. of years: " + years);
        System.out.println("No. of weeks: " + weeks);
        System.out.println("No. of days: " + days);

        // Day of the week finder
        System.out.print("Enter day, month, and year: ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        System.out.println("Day of the week: " + getDayOfWeek(day, month, year));
    }

    public static String getDayOfWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.toString();
    }
}
