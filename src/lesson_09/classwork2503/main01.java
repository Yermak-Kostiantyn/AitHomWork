package lesson_09.classwork2503;

import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {
        /*Пользователь вводит сколько угодно чисел, посчитать сумму всех этих чисел
          Ввод останавливается когда вводится 0
                 */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += number;
            number = scanner.nextInt();
        }
        System.out.println(sum);
    }
}
