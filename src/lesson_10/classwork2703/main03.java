package lesson_10.classwork2703;

import java.util.Scanner;

public class main03 {
    public static void main(String[] args) {
        int[] array = {17, 5, -6, 0, 1, 8};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Enter value from array");

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Index of value is: " + index);
        }

    }
}
