package lesson_18.ClassWork_2204.HomeWork;

public class Pen {

    private int inkLevel; // Количество чернил

    // Конструктор класса Pen
    public Pen() {
        this.inkLevel = 100; // Устанавливаем начальное количество чернил
    }

    // Геттер для получения количества чернил
    public int getInkLevel() {
        return inkLevel;
    }

    // Метод для написания текста
    public void write(String text) {
        // Проверяем, достаточно ли чернил для написания текста
        if (inkLevel >= text.length()) {
            System.out.println(text); // Выводим текст в консоль
            inkLevel -= text.length(); // Уменьшаем количество чернил на количество написанных символов
        } else {
            System.out.println("Недостаточно чернил для написания этой строки");
        }
    }

}
