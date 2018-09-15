package Package1;

import java.util.Arrays;

public class HW {
    public static void main(String[] args) {
        int x[] = new int[5];
        for (int i = 0; i < 5; i++) {
            int y = 0;
            y = Integer.parseInt(args[i]);
            x[i] = y;
        }
        int sum = 0;
        int mult = 1;
        for (int i = 0; i < 5; i++) {
            sum += x[i];
            mult *= x[i];
        }
        System.out.println(Arrays.toString(args));
        System.out.println("sum = " + sum);
        System.out.println("mult = " + mult);
    }
}
