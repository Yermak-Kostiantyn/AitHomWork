package HomePraсtick.Scanner;

import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1 число: ");
        int num1 = scanner.nextInt();

        System.out.println("Введите 2 число: ");
        int num2 = scanner.nextInt();

        int res1 = num1 + num2;
        int res2 = num1 - num2;
        int res3 = num1 * num2;
        int res4 = num1 / num2;


        System.out.println("Результат: ");
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4);




    }
}
