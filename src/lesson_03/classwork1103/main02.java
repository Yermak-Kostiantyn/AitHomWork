package lesson_03.classwork1103;

public class main02 {
    public static void main(String[] args) {
        // Происходит потеря данных при явном сужающем преобразовании
        byte number = (byte)45.1;
        System.out.println(number);
    }
}
