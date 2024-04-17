package lesson_11.HomeWork11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствуем в CurrencyConverter!");

        // Массив для хранения названий валют
        String[] currencies = {"EURO", "USD", "TRY", "CHF", "JPY"};
        // Массив для хранения курсов валют относительно EURO
        double[] rates = {1.0, 1.2, 0.1, 1.4, 0.01};

        // Бесконечный цикл для обработки выбора пользователя
        while (true) {
            // Выводим доступные валюты для выбора
            System.out.println("Выберите исходную валюту:");
            for (int i = 0; i < currencies.length; i++) {
                System.out.println((i + 1) + ". " + currencies[i]);
            }
            System.out.println("0. Exit");

            // Считываем выбор пользователя
            int selection = scanner.nextInt();
            if (selection == 0) {
                System.out.println("До свидания!");
                break; // Выход из цикла при выборе выхода
            }

            // Считываем сумму денег в исходной валюте
            System.out.println("Введите сумму в исходной валюте:");
            double amount = scanner.nextDouble();

            // Выбор валюты для конвертации
            System.out.println("Выберите валюту для конвертации:");
            for (int i = 0; i < currencies.length; i++) {
                System.out.println((i + 1) + ". " + currencies[i]);
            }
            int targetCurrency = scanner.nextInt();
            if (targetCurrency < 0 || targetCurrency > currencies.length) {
                System.out.println("Некорректный выбор валюты для конвертации.");
                continue; // Переход к следующей итерации цикла
            }

            // Вычисляем результат конвертации
            double result = amount * rates[selection - 1] / rates[targetCurrency - 1];

            // Выводим результат
            System.out.println("Результат конвертации: " + result + " " + currencies[targetCurrency - 1]);
        }
    }
}
