package lesson_11.HomeWork09;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int counter = 0;
        do {
            System.out.println("Enter natural number: ");
            number = scanner.nextInt();

            counter++;

        } while (number <= 0);

        System.out.println("You entered: " + number + ". Attemps: " + counter + ". Thank you!");
    }
}
