package programExercise;

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        double result = ((num1 + num2 + num3) / 3);

        System.out.print("Average of all 3 numbers is " + result);

        scanner.close();
    }
}
