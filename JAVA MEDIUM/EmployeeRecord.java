import java.util.HashMap;
import java.util.Map;
public class EmployeeRecord {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");
        System.out.println("Employee records:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        if (employeeMap.isEmpty()) {
            System.out.println("The employee map is empty.");
        } else {
            System.out.println("The employee map is not empty.");
        }
        int idToRemove = 102;
        employeeMap.remove(idToRemove);
        System.out.println("Employee with ID " + idToRemove + " removed.");
        System.out.println("Employee records after removal:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        employeeMap.clear();
        System.out.println("All employee records cleared.");
        if (employeeMap.isEmpty()) {
            System.out.println("The employee map is empty after clearing.");
        } else {
            System.out.println("The employee map is not empty after clearing.");
        }
    }
}
