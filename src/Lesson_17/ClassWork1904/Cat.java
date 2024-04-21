package Lesson_17.ClassWork1904;

public class Cat {
    String name;
    String color;
    int age;

    public Cat(String catName) {
        name = catName;
    }

    public Cat(String catName, String color) {
        name = catName;
        this.color = color;
    }

    public Cat(String name, String color, int age) {
        this(name, color);
        this.age = age;
    }

    public void sleep() {
        System.out.println("Я сплю!");
    }

    void run() {
        System.out.println("Я бегу!");
    }

    void sayMeow() {
        System.out.println("Meow!");
    }

    void sayMeow(String string) {
        System.out.println("Hello! Meow, " + string);
    }

    public void whoAmI() {
        System.out.println("Я котик " + name + ", мой возраст: " +
                age + ", и мой окрас: " + color);
    }
}
