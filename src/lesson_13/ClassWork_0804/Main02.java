package lesson_13.ClassWork_0804;

import java.util.Random;
import java.util.Scanner;

public class Main02 {

    public static int rollDIce() {
        Random random = new Random();
        int roll = 1 + random.nextInt(6);
        return roll;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            int roll = rollDIce();
            System.out.println("Dice rolled " + roll);

            input = scanner.next();

        } while (!input.equals("0"));
    }


}
