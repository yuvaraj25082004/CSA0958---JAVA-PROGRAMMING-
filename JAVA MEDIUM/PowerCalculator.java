public class PowerCalculator {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double result = myPow(x, n / 2);
        if (n % 2 == 0) {
            return result * result;
        } else {
            if (n > 0) {
                return result * result * x;
            } else {
                return result * result / x;
            }
        }
    }

    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        double result = myPow(x, n);
        System.out.println("Output: " + result);
    }
}
