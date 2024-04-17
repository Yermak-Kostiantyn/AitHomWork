package lesson_10.HomeWork;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your question: ");
        String question = scanner.nextLine();
        Random random = new Random(question.hashCode());

        int answer = random.nextInt(9);
        String[] answers = {
                "Да.", "Нет.", "Весьма вероятно.", "Не рассчитывай на это.",
                "Не могу предсказать.", "Да, но будь осторожен.", "По всей видимости.",
                "Знаки указывают на \"да\".", "Знаки указывают на \"нет\"."
        };
        String randomAnswer = answers[answer];
        System.out.println(randomAnswer);
    }
}
