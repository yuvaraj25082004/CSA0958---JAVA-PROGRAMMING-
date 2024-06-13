import java.util.HashMap;
import java.util.Map;
class Bank {
    private static final Map<String, Double> interestRates = new HashMap<>();
    static {
        interestRates.put("SBI", 8.4);
        interestRates.put("ICICI", 7.3);
        interestRates.put("AXIS", 9.7);
    }

    public static double getInterestRate(String bankName) {
        return interestRates.getOrDefault(bankName, 0.0);
    }
}
public class BankInterestRates {
    public static void main(String[] args) {
        String[] testCases = {
            "SBI, 8.3",
            "ICICI, 7.3",
            "AXIS, 9.7",
            "SBI, 8.6",
            "AXIX, 7.6" 
        };

        System.out.println("Test cases:");
        for (String testCase : testCases) {
            String[] parts = testCase.split(", ");
            String bankName = parts[0];
            double expectedRate = Double.parseDouble(parts[1]);
            double actualRate = Bank.getInterestRate(bankName);
            System.out.println(bankName + ": Expected Rate - " + expectedRate + ", Actual Rate - " + actualRate);
        }
    }
}
