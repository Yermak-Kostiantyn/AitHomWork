package consultation.Consultation0404;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствуем в CurrencyConverter!");

        // Массив для хранения названий валют
        String[] currencies = {"EURO", "USD", "TL", "CHF", "JPY", "Выход"};
        // Массив для хранения курсов валют относительно EURO
        double[] rates = {1.0, 1.2, 0.1, 1.4, 0.01};

        // Бесконечный цикл для обработки выбора пользователя
        while (true) {
            // Выводим доступные валюты для выбора
            System.out.println("Выберите исходную валюту:");
            for (int i = 0; i < currencies.length - 1; i++) {
                System.out.println((i + 1) + ". " + currencies[i]);
            }
            System.out.println("0. " + currencies[currencies.length - 1]);

            // Считываем выбор пользователя
            int selection = scanner.nextInt();
            if (selection == 0) {
                System.out.println("До свидания!");
                break; // Выход из цикла при выборе выхода
            } else if (selection < 0 || selection > currencies.length - 1) {
                System.out.println("Некорректный выбор.");
                continue; // Переход к следующей итерации цикла
            }

            // Считываем сумму денег в исходной валюте
            System.out.println("Введите сумму в исходной валюте:");
            double amount = scanner.nextDouble();

            // Выбор валюты для конвертации
            System.out.println("Выберите валюту для конвертации:");
            for (int i = 0; i < currencies.length - 1; i++) {
                System.out.println((i + 1) + ". " + currencies[i]);
            }
            System.out.println("0. " + currencies[currencies.length - 1]);
            int targetCurrency = scanner.nextInt();
            if (targetCurrency < 0 || targetCurrency > currencies.length - 1) {
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
