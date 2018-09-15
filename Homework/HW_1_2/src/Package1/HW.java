package Package1;

import java.util.Arrays;

public class HW {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
}
