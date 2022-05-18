package primitive9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a1= new int[]{0,2,2};
        int[] a2= new int[]{1,3};
        int[] a3= mergeArrays(a1,a2);
        System.out.println(Arrays.toString(a3));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int i = 0,j = 0,r=0;

        for (r = 0; i < a1.length && j < a2.length;) {
            if (a1[i] < a2[j]) {
                result[r] = a1[i];
                i++;
            } else {
                result[r] = a2[j];
                j++;
            }
            r++;
            if (i < a1.length) {
                System.arraycopy(a1, i, result, r, a1.length - i);
            }

            if (j < a2.length) {
                System.arraycopy(a2, j, result, r, a2.length - j);
            }
        }
        return result;
    }
}

