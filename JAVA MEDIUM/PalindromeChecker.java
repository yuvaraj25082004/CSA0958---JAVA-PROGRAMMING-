import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Case (1 for string, 2 for number):");
        int caseType = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        switch (caseType) {
            case 1:
                System.out.println("Enter the string:");
                String inputString = scanner.nextLine();
                if (isPalindrome(inputString)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }
                break;
            case 2:
                System.out.println("Enter the number:");
                String inputNumber = scanner.nextLine();
                if (isPalindrome(inputNumber)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }
                break;
            default:
                System.out.println("Invalid case");
                break;
        }

        scanner.close();
    }

    public static boolean isPalindrome(String input) {
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
