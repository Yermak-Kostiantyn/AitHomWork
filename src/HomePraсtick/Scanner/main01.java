package HomePraсtick.Scanner;

import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String username = scanner.nextLine();
        System.out.println("Привет, " + username);
    }
}
