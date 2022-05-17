package primitive3;
/**
 * Проверено
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(drawisMonitorsCounter(100,3));
    }
    public static int drawisMonitorsCounter(int monitors, int programmers){
        return monitors%programmers;
    }

}
