package lesson_11.HomeWork09;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        1. Ввод данных
        2. Создать массив и посчитать
        3. Посчитать сумму всех элементов массива
        4. Выводим результат
         */
        Scanner scanner = new Scanner(System.in);
        double initialValue = scanner.nextDouble(); // initial value - начальное значение
        double step = scanner.nextDouble(); // step - шаг
        int amount = scanner.nextInt(); // amount - колличество

        double[] sequence = new double[amount]; // sequence - последовательность
        // в нулевой элемент записывает начальное значение
        sequence[0] = initialValue;
        for (int i = 0; i < amount - 1; i++) {
            // следуюший элемент вычисляем как сумму текущего элемента и шага (т.е следующий на шаг больше предыдущего)
            sequence[i + 1] = sequence[i] + step;
        }

        double sum = 0;
        for (int i = 0; i < sequence.length; i++) {
            sum += sequence[i];
        }

        System.out.println("Sum: " + sum);

    }
}
