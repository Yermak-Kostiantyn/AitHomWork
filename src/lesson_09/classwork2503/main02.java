package lesson_09.classwork2503;

import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {
        /*Пользователь вводит сколько угодно чисел, посчитать сумму всех этих чисел
          Ввод останавливается когда вводится 0
                 */
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        do {
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

            System.out.println(sum);
    }
}
