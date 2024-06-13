class MultiplicationTable extends Thread {
    private int number;
    public MultiplicationTable(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " X " + i + " = " + (number * i));
                Thread.sleep(500); // Sleep to simulate work and thread states
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}
public class MultiplicationTableThread {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter two numbers to generate their multiplication tables:");
            String input1 = scanner.next();
            String input2 = scanner.next();
            try {
                int num1 = Integer.parseInt(input1);
                int num2 = Integer.parseInt(input2);
                MultiplicationTable table1 = new MultiplicationTable(num1);
                MultiplicationTable table2 = new MultiplicationTable(num2);
                table1.start();
                table2.start();
                table1.join();
                table2.join();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Please enter valid integers.");
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
    }
}