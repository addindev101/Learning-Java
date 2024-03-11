package programExercise;

import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String binaryNumber;
        do {
            System.out.print("Enter binary number: ");
            binaryNumber = scanner.nextLine();
            if (!isValidBinary (binaryNumber)) {
                System.out.println("Invalid input. Please enter a binary number containing only 0 and 1.");
            }
        } while (!isValidBinary (binaryNumber));

        int decimal = binaryToDecimal (binaryNumber);

        System.out.println("Decimal representation: " + decimal);

        scanner.close();
    }

    private static boolean isValidBinary (String binary) {
        return binary.matches("[01]+");
    }

    private static int binaryToDecimal (String binaryNumber) {
        return Integer.parseInt(binaryNumber, 2);
    }
}
