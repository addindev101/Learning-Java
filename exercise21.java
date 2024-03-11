package programExercise;

import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the decimal number: ");
        int decimal = scanner.nextInt();

        String octalRepresentation = decimalToOctal(decimal);

        System.out.println("Octal Representation: " + octalRepresentation);

        scanner.close();
    }

    private static String decimalToOctal(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 8;
            octal.insert(0, remainder);
            decimal /= 8;
        }

        return octal.toString();
    }
}
