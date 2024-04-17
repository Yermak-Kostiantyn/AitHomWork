package lesson_08.classwork2203.practice;

import java.util.Scanner;

public class main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("Введите несколько чисел (для окончания введите 0):");

        while (true) {
            int number = scanner.nextInt();


            if (number == 0) {
                break;
            }

            sum += number;
            count++;
        }

        if (count == 0) {
            System.out.println("Вы не ввели ни одного числа.");
        } else {
            double average = (double) sum / count;


            System.out.println("Сумма введенных чисел: " + sum);
            System.out.println("Среднее арифметическое: " + average);
        }
    }
}
