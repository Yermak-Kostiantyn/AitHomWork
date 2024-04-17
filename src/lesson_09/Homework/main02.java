package lesson_09.Homework;

import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное значение:");
        int initialValue = scanner.nextInt();

        System.out.println("Введите шаг:");
        int step = scanner.nextInt();

        System.out.println("Введите количество элементов:");
        int count = scanner.nextInt();

        int[] sequence = new int[count];

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sequence[i] = initialValue + i * step;
            sum += sequence[i];
        }

        System.out.println("Сумма = " + sum);
    }
}