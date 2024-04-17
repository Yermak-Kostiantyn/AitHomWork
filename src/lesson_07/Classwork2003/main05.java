package lesson_07.Classwork2003;

import java.util.Scanner;

public class main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();

        if (mark <30) {
            System.out.println("F");
        } else if (mark < 60) {
            System.out.println("D");
        } else if (mark < 75) {
            System.out.println("C");
        } else if (mark < 90) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
        // Доп задание: также перевести оценку из буквенной в цифровую пятибальную
        //НЕ ИСПОЛЬЗУЯ switch или любой другой оператор (в одну строку)
    }
}
