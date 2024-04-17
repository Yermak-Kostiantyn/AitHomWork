package lesson_08.classwork2203.practice;


public class main02 {
    public static void main(String[] args) {

        String text = "Пример (текста) с @специ@альными сим@волами";
        StringBuilder cleanedText = new StringBuilder();

        // Проходим по каждому символу в строке
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Проверяем, является ли текущий символ специальным
            if (currentChar != '(' && currentChar != ')' && currentChar != '@') {
                cleanedText.append(currentChar); // Добавляем его к очищенной строке
            }
        }

        System.out.println("Очищенная строка: " + cleanedText.toString());
    }
}
