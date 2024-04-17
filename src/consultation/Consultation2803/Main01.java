package consultation.Consultation2803;

public class Main01 {
    public static void main(String[] args) {
        //умножить отрицательные на 3, положительные на 5
        // а потом поменять знаки всем числам
        int[] array = {-7, -5, 2, -3, 8};

        // Выводим массив
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        //умножить отрицательные на 3, положительные на 5
        for (int i = 0; i < array.length; i++) {
       //     array[i] *= array[i] < 0 ? 3 : 5;
            if (array[i] <0) {
                array[i] *= 3;
            } else {
                array[i] *= 5;
            }

        }
        //Выводим массив
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        //Поменять знаки всем числам на противоположные
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }


        //Выводим массив
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
