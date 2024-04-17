package lesson_05.homework5;

import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой возраст!");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Вы еще не родились");
        } else if (age < 13) {
            System.out.println("Вы ребенок");
        } else if (age < 20) {
            System.out.println("Вы подросток");
        } else if (age < 65) {
            System.out.println("Вы взрослый");
        } else {
            System.out.println("Вы пожилой человек");
        }

    }
}
