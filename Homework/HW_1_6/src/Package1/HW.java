package Package1;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        System.out.println("Сколько чисел вы хотите ввести?");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Введите " + n + " целых чисел, после ввода каждого нажмите Enter:");
        int numInt[] = new int[n];
        for (int i = 0; i < n; i++) {
            Integer numStr = scan.nextInt();
            numInt[i] = numStr;
        }

        String ev = new String();
        String notEv = new String();
        for (int i = 0; i < n; i++) {
            if (numInt[i] % 2 == 0) {
                ev = ev + Integer.toString(numInt[i]) + " ";
            } else {
                notEv = notEv + Integer.toString(numInt[i]) + " ";
            }
        }
        System.out.println("Четные числа: " + ev);
        System.out.println("Нечетные числа: " + notEv);

        int max = 0;
        int min = numInt[0];
        for (int i = 0; i < n; i++) {
            if (max < numInt[i]) {
                max = numInt[i];
            }
            if (min > numInt[i]) {
                min = numInt[i];
            }
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);

        String sh39 = new String();
        for (int i = 0; i < n; i++) {
            if ((numInt[i] % 3 == 0) || (numInt[i] % 9 == 0)) {
                sh39 = sh39 + Integer.toString(numInt[i]) + " ";
            }
        }
        System.out.println("Числа которые делятся на 3 или на 9: " + sh39);

        String sh57 = new String();
        for (int i = 0; i < n; i++) {
            if ((numInt[i] % 5 == 0) && (numInt[i] % 7 == 0)) {
                sh57 = sh57 + Integer.toString(numInt[i]) + " ";
            }
        }
        System.out.println("Числа которые делятся на 5 и 7: " + sh57);

        String strThree = new String();
        for (int i = 0; i < n; i++) {
            int count = 0;
            String counStr = Integer.toString(numInt[i]);
            count = counStr.length();
            if (count == 3) {
                if (
                        (counStr.charAt(0) != counStr.charAt(1)) && (counStr.charAt(0) != counStr.charAt(2)) && (counStr.charAt(1) != counStr.charAt(2))) {
                    strThree = strThree + Integer.toString(numInt[i]) + " ";
                }
            }
        }
        System.out.println("Трехзначные числа с неповторяющимися цифрами: " + strThree);
//6.6. «Счастливые» числа.
        String lackyNum = new String();
        for (int i = 0; i < n; i++) {
            int count = 0;
            String counStr = Integer.toString(numInt[i]);
            count = counStr.length();
            int digit = 0;
            int lucky1 = 0;
            int lucky2 = 0;
            if (count % 2 == 0) {
                for (int j = 0; j < count; j++) {
                    String str = String.valueOf(counStr.charAt(j));
                    digit = Integer.parseInt(str);
                    if (j <= ((count/2)-1)) {
                        lucky1 = lucky1 + digit;
                    } else {
                        lucky2 = lucky2 + digit;
                    }
                }
                if (lucky1 == lucky2) {
                    lackyNum = lackyNum + Integer.toString(numInt[i]) + " ";
                }
            }
        }
        System.out.println("Cчастливые числа: " + lackyNum);
    }
}
