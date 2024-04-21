package Lesson_17.ClassWork1904;

import javax.xml.catalog.Catalog;

public class Main02 {
    public static void main(String[] args) {
        Cat cat = new Cat("Max");

        cat.sayMeow();
        cat.run();
        cat.sayMeow();

        String catName = cat.name;
        System.out.println("Name: " + catName);

        System.out.println("Color: " + cat.color);
        System.out.println("Age: " + cat.age);

        System.out.println("\n ============ \n");

        Cat cat1 = new Cat( "Max");

        System.out.println("Color cat1!: " + cat.color);
        System.out.println("Name cat1: " + cat1.name);

        System.out.println("\n =========== \n");

        Cat cat2 = new Cat("Diamond", "red");
        cat2.whoAmI();

        Cat cat3 = new Cat("Kratos", "black", 9);
        cat3.whoAmI();
    }
}
