package lesson_19.ClassWork_2404.example1;

public class Main {
    public static void main(String[] args) {

        Human mihail = new Human("Mihail", 3);
        Human olga = new Human("Olga", 2);

        System.out.println(mihail.getName());
        System.out.println(olga.getName());
        System.out.println("Species: " + mihail.species);
        olga.species = "Domestic cat";
    }
}
