package primitive5;

/**
 * Проверено
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4));
    }
    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }
}

