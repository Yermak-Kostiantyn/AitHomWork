package Lesson_17.HomeWork;

public class HomeWork {
    public class Student {
        String name;
        int age;
        String university;
        String profession;

        public Student(String name, int age, String university, String profession) {
            this.name = name;
            this.age = age;
            this.university = university;
            this.profession = profession;
        }

        public void AboutMe() {
            System.out.println("Студент: " + name + ", возраст " + age + ", учится на" + university + " профессия" + profession);
        }
    }

    public class Teacher {
        String name;
        int age;
        String university;
        String profession;

        public Teacher(String name, int age,String university, String profession) {
            this.name = name;
            this.age = age;
            this.university = university;
            this.profession = profession;
        }

        public void AboutMe() {
            System.out.print("Учитель: " + name + ", возраст " + age + ", учился в" + university + " профессия" + profession);
        }
    }

    public class Doctor {
        String name;
        int age;
        String university;
        String profession;

        public Doctor(String name, int age, String profession) {
            this.name = name;
            this.age = age;
            this.university = university;
            this.profession = profession;
        }

        public void AboutMe() {
            System.out.print("Доктор: " + name + ", возраст " + age + ", учился в" + university + " профессия" + profession);
        }
    }

    


}
