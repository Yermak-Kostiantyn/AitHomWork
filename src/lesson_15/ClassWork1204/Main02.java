package lesson_15.ClassWork1204;

import java.sql.PreparedStatement;

public class Main02 {

    public static int sum(int[] array) {
        return sum(array, 0, array.length);
    }

    public static int sum(int[] array, int from, int to) {
        int sum = 0;
        for (int i = from; i < to; i ++) {
            sum += array[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println();

    }
}
