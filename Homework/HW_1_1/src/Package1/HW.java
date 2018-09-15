package Package1;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Привет, " + name);
    }
}
