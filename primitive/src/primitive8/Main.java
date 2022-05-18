package primitive8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 20, 8, 7, 3, 100};
        printOddNumbers(arr);
    }

    public static void printOddNumbers(int[] arr) {
        ArrayList<String> list = new ArrayList<>();
        for (int i : arr)
            if ((i & 1) == 1)
                list.add(i + "");
        System.out.print(String.join(", ", list));
        System.out.println();
    }
}

