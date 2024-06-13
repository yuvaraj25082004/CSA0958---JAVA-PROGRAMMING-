public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
            int[] numbers = {1, 2, 3};
            int number = numbers[5];
            String text = null;
            int length = text.length(); // This will cause NullPointerException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("An exception occurred: " + e.getClass().getSimpleName());
            System.out.println("Exception message: " + e.getMessage());
        }
        System.out.println("Program continues to run normally.");
    }
}
