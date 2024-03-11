package programExercise;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input numbers to do Multiplication.");
        System.out.print("First number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Second number: ");
        int secondNumber = scanner.nextInt();

        int result = (firstNumber * secondNumber);

        System.out.println("Result of " + firstNumber + " x " + secondNumber + " = " + result);

        scanner.close();
    }
}
