package lesson_08.classwork2203.practice;

import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");

        int userInt = scanner.nextInt();

        boolean isSimple = true;

        for (int i = 2; i < userInt; i++) {
            if (userInt % i ==0) {
                isSimple = false;
            }
        }

        if (isSimple) {
            System.out.println("Число " + userInt + "");
        }
    }
}
