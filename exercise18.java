package programExercise;

import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String binary1;
        do {
            System.out.print("Enter first binary number: ");
            binary1 = scanner.nextLine();
            if (!isValidBinary(binary1)) {
                System.out.print("Invalid input. Binary number only 1 and 0! ");
            }
        } while (!isValidBinary(binary1));

        String binary2;
        do {
            System.out.print("Enter second binary number: ");
            binary2 = scanner.nextLine();
            if (!isValidBinary(binary2)) {
                System.out.print("Invalid input. Binary number only 1 and 0! ");
            }
        } while (!isValidBinary(binary2));

        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        int sum = (decimal1 * decimal2);

        String binarySum = Integer.toBinaryString(sum);

        System.out.println("Product of " + binary1 + " and " + binary2 + " is " + binarySum);

        scanner.close();
        }

        private static boolean isValidBinary(String binary) {
            return binary.matches("[01]+");
    }
}
