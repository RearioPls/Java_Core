package primitive1;

public class Main {
    public static void main(String[] args) {
        System.out.println(doubleExpression(1,1,2));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        boolean z = false;
        if (Math.abs(a + b) - c <= 1E-4) {
            z = true;
        }
        return z;
    }
}
