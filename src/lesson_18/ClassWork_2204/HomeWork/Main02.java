package lesson_18.ClassWork_2204.HomeWork;

public class Main02 {
    public static void main(String[] args) {
        Pen pen = new Pen(); // Создаем объект ручка
        System.out.println("Начальное количество чернил: " + pen.getInkLevel()); // Выводим начальное количество чернил

        pen.write("Любой текст, для проверки программы"); // Написать текст
        System.out.println("Оставшееся количество чернил: " + pen.getInkLevel()); // Выводим оставшееся количество чернил
    }
}
