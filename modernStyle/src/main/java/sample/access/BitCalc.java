package sample.access;

public class BitCalc {

    public static void main(String[] args) {
        int number = 0x12345678;
        System .out.println("number: " + number);
        int higher = number >> 16;
        System.out.println(higher);
        int num8bit = 011;
        System.out.println(num8bit);
        int num2bit = 0b11;
        System.out.println(num2bit);
    }

    public static String FILE_FORMAT = "json";
}
