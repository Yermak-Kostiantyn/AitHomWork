package lesson_05.homework5;

import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter yuor mothly income");
        int income = scanner.nextInt();

        int incomeTax;

        if (income > 20000) {
            incomeTax = (int) (income * 0.22f); // 22%
        } else if (income > 10000 ) {
            incomeTax = (int) (income * 0.18f); // 19%
        } else {
            incomeTax = (int) (income * 0.13f); // 13%
        }
        float socialTax = income * 0.03f;  // 3%


        System.out.println("Pension fund tax: " + socialTax);
        System.out.println("Income tax: " + incomeTax);
        System.out.println("Total profit: " + (income - incomeTax - socialTax));
    }
}
