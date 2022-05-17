package primitive1;
/*
Исправить, отрефакторить метод doubleExpression, убрать лишние переменные и if
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(doubleExpression(1,1,2));
    } // давно 1 или 2 стали double?

    public static boolean doubleExpression(double a, double b, double c) {  // записать ретурн в одну строку без лишних переменных
        boolean z = false;
        if (Math.abs(a + b) - c <= 1E-4) {
            z = true;
        }
        return z;
    }
}
