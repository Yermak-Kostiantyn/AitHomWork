package lesson_11.HomeWork10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i =0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i =0; i < array.length; i++) {
            array[i] *= 2;
        }

        int[] doubleArray = new int[size *2];

        for (int i = 0; i < array.length; i++) {
            doubleArray[i * 2] = array[i];
            doubleArray[i * 2 + 1] = array[i];
        }

        for (int i =0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i] + " ");
        }
    }
}
