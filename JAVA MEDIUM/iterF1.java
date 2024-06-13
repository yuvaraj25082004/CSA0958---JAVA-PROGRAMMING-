interface IterF1 {
    int add(int a, int b); 
    int sub(int a, int b); }
class MyClass implements IterF1 {
    @Override
    public int add(int a, int b) {
        return a + b;     }
    @Override
    public int sub(int a, int b) {
        return a - b;     }
}
public class iterF1{
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        int resultAdd = obj.add(5, 3);
        System.out.println("Addition result: " + resultAdd);

        int resultSub = obj.sub(5, 3);
        System.out.println("Subtraction result: " + resultSub);
    }
}
