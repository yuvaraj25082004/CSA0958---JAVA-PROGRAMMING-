import java.util.Scanner;
public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String inputString = scanner.nextLine();


        System.out.println("Enter the word to be replaced: ");
        String wordToReplace = scanner.nextLine();
        System.out.println("Enter the new word: ");
        String newWord = scanner.nextLine();
        String replacedString = inputString.replace(wordToReplace, newWord);
        System.out.println("String after replacement: " + replacedString);
        int lengthOfString = inputString.length();
        System.out.println("Length of the string: " + lengthOfString);
        String upperCaseString = inputString.toUpperCase();
        System.out.println("String in uppercase: " + upperCaseString);
        scanner.close();
    }
}
