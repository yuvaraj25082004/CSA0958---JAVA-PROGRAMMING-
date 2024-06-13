import java.util.Scanner;

class Superclass {
    int num1;
    int num2;

    Superclass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}

class Subclass extends Superclass {
    int num1;
    int num2;

    Subclass(int num1, int num2) {
        super(num1, num2); // Calling superclass constructor
        this.num1 = num1;
        this.num2 = num2;
    }

    void display() {
        System.out.println("Superclass num1: " + super.num1);
        System.out.println("Superclass num2: " + super.num2);
        System.out.println("Subclass num1: " + num1);
        System.out.println("Subclass num2: " + num2);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num1 and num2:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        Subclass obj = new Subclass(num1, num2);
        
        System.out.println("Output:");
        obj.display();

        scanner.close();
    }
}
