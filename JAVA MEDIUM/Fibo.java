import java.util.Scanner;
class FibonacciRunnable implements Runnable {
    private int count;
    public FibonacciRunnable(int count) {
        this.count = count;
    }
    @Override
    public void run() {
        if (count < 1) {
            System.out.println("The number must be greater than 0 to generate a Fibonacci series.");
            return;
        }
        long[] fibSeries = new long[count];
        if (count > 0) {
            fibSeries[0] = 0;
        }
        if (count > 1) {
            fibSeries[1] = 1;
        }
        for (int i = 2; i < count; i++) {
            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
        }
        for (int i = 0; i < count; i++) {
            System.out.print(fibSeries[i] + " ");
        }
        System.out.println();
    }
}
public class Fibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibonacci series:");
        String input = scanner.next();
        try {
            int count = Integer.parseInt(input);
            if (count <= 0) {
                System.out.println("Invalid input: The number must be greater than 0.");
            } else {
                FibonacciRunnable fibonacciRunnable = new FibonacciRunnable(count);
                Thread fibonacciThread = new Thread(fibonacciRunnable);
                fibonacciThread.start();
                fibonacciThread.join();
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid integer.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        scanner.close();
    }
}