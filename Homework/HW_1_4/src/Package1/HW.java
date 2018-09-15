package Package1;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        System.out.println("Введите пароль:");
        Scanner scan = new Scanner(System.in);
        String passInp = scan.next();
        if (passInp.equals("password")) {
            System.out.println("Пароль верный");
        } else {
            System.err.println("Пароль неверный");
        }
    }
}
