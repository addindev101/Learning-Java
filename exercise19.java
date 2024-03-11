package programExercise;

import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the decimal number: ");
        int decimal = scanner.nextInt();

        String binaryRepresentation = decimalToBinary(decimal);

        System.out.println("Binary representation: " + binaryRepresentation);

        scanner.close();
    }

    private static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }

        return binary.toString();
    }
}
