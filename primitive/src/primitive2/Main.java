package primitive2;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
