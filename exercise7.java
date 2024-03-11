package programExercise;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multiplier;

        do {
            System.out.print("Input the number between 2 to 10: ");
            multiplier = scanner.nextInt();

            if (multiplier >= 2 && multiplier <= 10) {
                for (int i = 1; i <= 10; i++) {
                    int result = multiplier * i;
                    System.out.println(multiplier + " x " + i + " = " + result);
                }
            } else {
                System.out.print("Invalid input, please reinput the number: ");
            }

        } while (multiplier < 2 || multiplier > 10);

        scanner.close();
    }
}
