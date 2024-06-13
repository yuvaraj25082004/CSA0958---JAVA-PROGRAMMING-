import java.util.Hashtable;

public class BankDetails {
    public static void main(String[] args) {
        Hashtable<Integer, String> bankDetails = new Hashtable<>();

        bankDetails.put(123456, "Alice");
        bankDetails.put(789012, "Bob");
        bankDetails.put(345678, "Charlie");

        System.out.println("Bank details:");
        for (Integer accountNumber : bankDetails.keySet()) {
            System.out.println("Account Number: " + accountNumber + ", Customer Name: " + bankDetails.get(accountNumber));
        }

        System.out.println("Size of the Hashtable: " + bankDetails.size());

        bankDetails.clear();
        System.out.println("Hashtable cleared.");

        System.out.println("Size of the Hashtable after clearing: " + bankDetails.size());
    }
}
