package lesson_06.Homework;

import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kg");
        float weight = scanner.nextFloat();
        System.out.println("Enter your height in cm");
        float height = scanner.nextFloat() / 100f;


        float bodyIndex = weight / (height * height);
        System.out.println("Your BMI is " + bodyIndex);

        if (bodyIndex < 15) {
            System.out.println("Анорексия");
        } else if (bodyIndex >= 15 && bodyIndex < 20) {
            System.out.println("Недостаточный вес");
        } else if (bodyIndex >= 20 && bodyIndex < 25) {
            System.out.println("Нормальный вес");
        } else if (bodyIndex >= 25 && bodyIndex < 30) {
            System.out.println("Лишний вес");
        } else {
            System.out.println("Ожирение");
        }
    }
}
