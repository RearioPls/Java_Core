package primitive1;

/**
 * Проверено
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(doubleExpression(1.1, 1.1, 2.7));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return (Math.abs(a + b - c) <= 1E-4);
    }
}
