package lesson_07.Classwork2003;

import java.util.Scanner;

public class main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b > c && b + c > a && c + a >b) {
            System.out.println("This is a triangle");
        } else {
            System.out.println("This is not triangle");
        }
        /* Доп задание: модифицировать таким образом, что бы программа определяля
        вид треугольника. т.е. Острый, тупой, равнобедренный, прямоугольный
         */
    }
}
