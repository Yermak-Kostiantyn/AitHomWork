package Lesson_17.ClassWork1904;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    String whoAmI() {
        return "I am dog " + this.name + ", my weight: " + this.weight;
    }

    void eat() {
        System.out.println("Я кушаю, ням-ням");
        weight++;
    }

    void run() {

        while (weight < 3) {
            System.out.println("Сорян! Я слишком худая и голодная! Бежать не могу");
            System.out.println("Надо поесть! Мой вес сейчас: " + weight);

            eat();
        }

        System.out.println("Я бегу!");
        weight -= 2; // weight = weight -2;
    }
}
