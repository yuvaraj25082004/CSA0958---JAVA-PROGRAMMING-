import java.util.Scanner;

public class CountSpecialCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the statement:");
        String statement = scanner.nextLine();
        int specialCharCount = countSpecialCharacters(statement);
        System.out.println("Number of special Characters: " + specialCharCount);
        scanner.close();
    }

    public static int countSpecialCharacters(String str) {
        int specialCharCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }
        return specialCharCount;
    }
}
