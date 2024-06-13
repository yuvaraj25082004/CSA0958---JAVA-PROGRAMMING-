import java.util.Scanner;
public class ATM {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBalance = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the " + (i + 1) + "st Denomination: ");
            int denomination = scanner.nextInt();
            System.out.println("Enter the " + (i + 1) + "st Denomination number of notes: ");
            int numberOfNotes = scanner.nextInt();
            totalBalance += denomination * numberOfNotes;
        }
        System.out.println("Total Available Balance in ATM: " + totalBalance);
        scanner.close();
    }
}
