package lesson_18.ClassWork_2204.HomeWork;

public class Student {
        private String name;
        private int age;
        private String university;
        private String profession;

        public Student(String name, int age, String university, String profession) {
            this.name = name;
            this.age = age;
            this.university = university;
            this.profession = profession;
        }

        // Геттеры для доступа к значениям приватных атрибутов
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getUniversity() {
            return university;
        }

        public String getProfession() {
            return profession;
        }

        public void AboutMe() {
            System.out.println("Студент: " + name + ", возраст " + age + ", учится на " + university + ", профессия " + profession);
        }
}
