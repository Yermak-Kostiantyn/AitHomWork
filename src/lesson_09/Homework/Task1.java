package lesson_09.Homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Введите натуральное число: ");
            while (!scanner.hasNext()) {
                System.out.println("Ошибка! Введите целое число: ");
                scanner.nextInt();
            }
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("Вы ввели " + number + " Спасибо!" );
    }
}
