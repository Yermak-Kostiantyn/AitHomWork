package lesson_13.ClassWork_0804;

import java.util.Scanner;

public class Main03 {

    public static double kmToMile(double km) {
        return km * 0.621371;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance in km:");
        double dist = scanner.nextDouble();
        double distMiles = kmToMile(dist);

        System.out.println("Distance in miles: " + distMiles);
    }
}
