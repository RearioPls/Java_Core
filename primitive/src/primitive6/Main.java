package primitive6;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a cat I saw?"));
    }
    public static boolean isPalindrome(String text){
        String str = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb = new StringBuilder(str);
        return str.equalsIgnoreCase(sb.reverse().toString());
    }
}
