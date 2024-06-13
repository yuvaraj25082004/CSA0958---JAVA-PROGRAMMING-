public class Singleton {
    private static Singleton instance;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        try {
            Singleton obj1 = Singleton.getInstance();
            System.out.println("First object created successfully.");

            Singleton obj2 = Singleton.getInstance();
            System.out.println("Second object created successfully.");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
