package primitive;

public class Main {
    public static void main(String[] args) {
        System.out.println(priceCalculation(8.50,2));
    }
    public static double priceCalculation(double price, int count){
        return price*count;
    }
}
