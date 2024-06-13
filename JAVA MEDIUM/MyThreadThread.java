class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        start(); 
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + getName() + ", Value: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class MyThreadThread {
    public static void main(String[] args) {
        MyThread thread = new MyThread("ChildThread");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", Value: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.err.println("Main thread interrupted: " + e.getMessage());
            }
        }
    }
}
