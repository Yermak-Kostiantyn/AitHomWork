package lesson_08.classwork2203;

public class main01 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int result = 0;

        int counter = 0;

        while (counter < 3) {
            x = x * y;
            System.out.println("Результат умножения x * y = " + result);
            x = x + 5;
            y = y + 10;
            counter++;


            System.out.println("Программа завершена успешно");

        }
    }
}
