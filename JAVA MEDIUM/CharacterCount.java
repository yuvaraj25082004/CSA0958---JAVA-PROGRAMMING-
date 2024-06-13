import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int numberCount = 0;

        System.out.println("Enter * to exit...");
        char ch;
        do {
            System.out.print("Enter any character: ");
            ch = scanner.next().charAt(0);

            if (ch != '*') {
                if (Character.isUpperCase(ch)) {
                    uppercaseCount++;
                } else if (Character.isLowerCase(ch)) {
                    lowercaseCount++;
                } else if (Character.isDigit(ch)) {
                    numberCount++;
                }
            }
        } while (ch != '*');

        System.out.println("Total count of lower case: " + lowercaseCount);
        System.out.println("Total count of upper case: " + uppercaseCount);
        System.out.println("Total count of numbers = " + numberCount);

        scanner.close();
    }
}
