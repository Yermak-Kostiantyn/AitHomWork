package consultation.Consultation2803;

public class Main05 {
    public static void main(String[] args) {
        int[] array = {-7, -5, 12, -3, 8, 20, 9, -6, 18};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        System.out.println("\nIndex of max number: " + minIndex + ", value: " + array[minIndex]);


    }
}
