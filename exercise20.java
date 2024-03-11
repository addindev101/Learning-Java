package programExercise;

import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the decimal number: ");
        int decimal = scanner.nextInt();

        String hexadecimalRepresentation = decimalToHexadecimal(decimal);

        System.out.println("Hexadecimal Representation: " + hexadecimalRepresentation);

        scanner.close();
    }

    private static String decimalToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder hexadecimal = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 16;
            hexadecimal.insert(0, getHexDigit(remainder));
            decimal /= 16;
        }

        return hexadecimal.toString();
    }

    private static char getHexDigit(int remainder) {
        if (remainder < 10) {
            return(char) ('O' + remainder);
        } else {
            return(char) ('A' + remainder - 10);
        }
    }
}
