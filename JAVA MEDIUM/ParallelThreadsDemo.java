import java.util.Scanner;
public class ParallelThreadsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of threads:");
        int numThreads = scanner.nextInt();

        for (int i = 1; i <= numThreads; i++) {
            System.out.println("Enter the starting number for Thread-" + i + ":");
            int startNumber = scanner.nextInt();
            Thread thread = new Thread(new NumberPrinter("Thread-" + i, startNumber));
            thread.start();
        }

        scanner.close();
    }
}

class NumberPrinter implements Runnable {
    private String threadName;
    private int startNumber;

    public NumberPrinter(String threadName, int startNumber) {
        this.threadName = threadName;
        this.startNumber = startNumber;
    }

    @Override
    public void run() {
        try {
            for (int i = startNumber; i <= 100; i += 3) {
                System.out.println(threadName + ": " + i);
                Thread.sleep(100); // Sleep for 100 milliseconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
