package lesson_03.classwork1103;

public class main04 {
    public static void main(String[] args) {
        short sNumber =  (short)0b1110_1000_1100_1101; //short sNumber = -5939
        // lossy conversion
        // В number уже будет только 11001101
        byte number = (byte)sNumber;

        System.out.println(sNumber);
        System.out.println(number);
    }
}
