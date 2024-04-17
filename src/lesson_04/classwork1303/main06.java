package lesson_04.classwork1303;

import java.util.Scanner;

public class main06 {
    public static void main(String[] args) {
        // создаем сканнер
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a and b");
        // создаем переменные, и сразу в них читаем из консоли значения
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // прибавляем введенные значения
        int res = a + b;
        // выводим результат на экран
        System.out.println("a + b = " + res);

    }
}
