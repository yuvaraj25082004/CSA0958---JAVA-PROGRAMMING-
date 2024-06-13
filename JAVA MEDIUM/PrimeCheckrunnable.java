import java.util.Scanner;
class PrimeCheckRunnable implements Runnable {
    private int number;
    public PrimeCheckRunnable(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        if (number <= 1) {
            System.out.println(number + " is not Prime");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is not Prime");
        }
    }
}
public class PrimeCheckrunnable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime:");
        String input = scanner.next();
        try {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Invalid input: Please enter a non-negative integer.");
            } else {
                PrimeCheckRunnable primeCheckRunnable = new PrimeCheckRunnable(number);
                Thread primeCheckThread = new Thread(primeCheckRunnable);
                primeCheckThread.start();
                primeCheckThread.join();
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid integer.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        scanner.close();
    }
}
